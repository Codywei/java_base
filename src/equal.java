public class equal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n=3;
        int m=3;

        System.out.println(n==m);

        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);

        str1 = str;
        str2 = str;
        System.out.println(str1==str2);

        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1.equals(str2));

         //string intern 方法，java1.6之后运行时常量池放到堆中
        String str6 = "SEUCalvin";//新加的一行代码，其余不变
        String str5 = new String("SEU")+ new String("Calvin");
        System.out.println(str5.intern() == str5);
        System.out.println(str5 == "SEUCalvin");
    }
}
