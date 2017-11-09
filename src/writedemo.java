import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class writedemo{
    static{
        System.out.println("weijianshuang");
    }
    public static void main(String[] args) throws IOException { // 异常抛出，  不处理
        // 第1步：使用File类找到一个文件
        try {
            File f = new File("test.txt");// 声明File 对象
            // 第2步：通过子类实例化父类对象
            Writer out = null;
// 准备好一个输出的对象   
            out = new FileWriter(f,true);
// 通过对象多态性进行实例化   
            // 第3步：进行写操作
            String str = "Hello World!!!";
// 准备一个字符串   
            out.write(str);
            out.flush();
// 将内容输出   
            // 第4步：关闭输出流
            // out.close();
// 此时没有关闭   
        }catch (IOException e){
               e.printStackTrace();
        }
    }
    static{
        System.out.println("chenggong");
    }
}  