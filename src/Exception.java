import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Exception 块需要注意的几个点
 * */
public class Exception {
    public static void main(String[] args) {
        String str = new Exception().openFile();
        System.out.println(str);

    }
/**
 　　三个块执行的顺序为try—>catch—>finally。

 　　当然如果没有发生异常，则catch块不会执行。但是finally块无论在什么情况下都是会执行的（这点要非常注意，因此部分情况下，都会将释放资源的操作放在finally块中进行）。

 　　在有多个catch块的时候，是按照catch块的先后顺序进行匹配的，一旦异常类型被一个catch块匹配，则不会与后面的catch块进行匹配。

 　　在使用try..catch..finally块的时候，注意千万不要在finally块中使用return，因为finally中的return会覆盖已有的返回值。

     无论try块或者catch块中是否包含return语句，都会执行finally块
 */
    public String openFile() {
        try {
            FileInputStream inputStream = new FileInputStream("d:/a.txt");
            int ch = inputStream.read();
            System.out.println("aaa");
            return "step1";
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return "step2";
        }catch (IOException e) {
            System.out.println("io exception");
            return "step3";
        }finally{
            System.out.println("finally block");
            //return "finally";
        }
    }
}