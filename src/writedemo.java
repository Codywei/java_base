import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * 字符流，字节流
 * 字符流操作，中间加了两个static类测试
 * 字节流在操作时本身不会用到缓冲区（内存），是文件本身直接操作的，而字符流在操作时使用了缓冲区，通过缓冲区再操作文件
 * static成员变量的初始化顺序按照定义的顺序进行初始化。
 * 与C/C++中的static不同，Java中的static关键字不会影响到变量或者方法的作用域。在Java中能够影响到访问权限的只有private、public、protected（包括包访问权限）这几个关键字。
 * */
public class writedemo{
    static{
        System.out.println("hello");
    }
    public static void main(String[] args) throws IOException {
        // 第1步：使用File类找到一个文件
        try {
            // 声明File 对象
            File f = new File("test.txt");
            // 第2步：通过子类实例化父类对象
            Writer out = null;
// 准备好一个输出的对象   
            out = new FileWriter(f,true);
// 通过对象多态性进行实例化   
            // 第3步：进行写操作
            String str = "Hello World!!!";
// 准备一个字符串   
            out.write(str);

// 将内容输出，如果想在不关闭时也可以将字符流的内容全部输出，则可以使用Writer类中的flush()方法完成。
            out.flush();
            // 第4步：关闭输出流
            // out.close();
         //此时没有关闭
        }catch (IOException e){
               e.printStackTrace();
        }
    }
    static{
        System.out.println("world");
    }
}  