/**
 * "=="和equal的几个测试程序,String intern的测试
 * */
public class equal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n=3;
        int m=3;

        System.out.println(n==m);//8种基本数据类型的变量，变量直接存储的是“值”，因此在用关系操作符==来进行比较时，比较的就是 “值” 本身

        String str = new String("hello");//引用类型的变量。比如上面的str1就是引用类型的变量，引用类型的变量存储的并不是 “值”本身，而是于其关联的对象在内存中的地址。
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);//分别指向的是不同的对象，也就是说它们实际存储的内存地址不同

        str1 = str;
        str2 = str;
        System.out.println(str1==str2);//分别指向的是相同的对象，也就是说它们实际存储的内存地址相同

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1.equals(str2));//在Object类中，equals方法是用来比较两个对象的引用是否相等，即是否指向同一个对象,但String类对equals方法进行了重写，用来比较指向的字符串对象所存储的字符串是否相等。
        /**
         * 　总结来说：

         　　1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；

         　　　　如果作用于引用类型的变量，则比较的是所指向的对象的地址

         　　2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量

         　　　　如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；

         　　　　诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。
         */



         //string intern 方法，java1.6之后运行时常量池放到堆中
        //当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（该对象由 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。
        String str6 = "SEUCalvin";
        String str5 = new String("SEU")+ new String("Calvin");
        System.out.println(str5.intern() == str5);
        System.out.println(str5.intern() == str6);
        System.out.println(str5 == "SEUCalvin");
        System.out.println("SEUCalvin" == str6);


        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a" + "b";
        String e = "b";
        String f = "a" + e;

        System.out.println(b.intern() == a);
        System.out.println(b.intern() == c);
        System.out.println(b.intern() == d);
        System.out.println(b.intern() == f);
        System.out.println(b.intern() == a.intern());
        /**
         * 由运行结果可以看出来，b.intern() == a和b.intern() == c可知，采用new 创建的字符串对象不进入字符串池，
         * 并且通过b.intern() == d和b.intern() == f可知，字符串相加的时候，都是静态字符串的结果会添加到字符串池，
         * 如果其中含有变量（如f中的e）则不会进入字符串池中。但是字符串一旦进入字符串池中，就会先查找池中有无此对象。
         * 如果有此对象，则让对象引用指向此对象。如果无此对象，则先创建此对象，再让对象引用指向此对象。
        在定义变量的时候赋值，如果赋值的是静态的字符串，就会执行进入字符串池的操作，如果池中含有该字符串，则返回引用。
         */
    }
}
