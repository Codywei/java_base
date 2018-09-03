/**
 类与继承

 在生成对象的过程中，会先初始化对象的成员变量，然后再执行构造器。

 也就是说类中的变量会在任何方法（包括构造器）调用之前得到初始化，即使变量散布于方法定义之间。

 如果类中有static语句块，则先会执行static语句块。static成员变量和static语句块的执行顺序同代码中的顺序一致

 注意，所有的构造器默认为static的。
 * */

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        new Meal();
        //向上转型（父类的引用指向子类对象）
        Bread bread=new BlackBread();
        System.out.println(bread.name);
        bread.eat();

    }
}

class Meal {
    /**
     * 对于  char、short、byte、int、long、float、double等基本数据类型的变量来说会默认初始化为0（boolean变量默认会被初始化为false）
     */

    char a;
    int  b;
    /**
     对于引用类型的变量，会默认初始化为null,如果没有显示地定义构造器，则编译器会自动创建一个无参构造器
     * */
    Bread bread1;

    public Meal() {
        System.out.println("meal");
    }

    Bread bread = new Bread();
}

class Bread {
    static{
        System.out.println("Bread is loaded");
    }

    public Bread() {
        System.out.println("bread");
    }

    public String name="Bread";
    private int s;
    public void eat(){
        System.out.println("eating bread");
    }
}

class  BlackBread extends Bread{
    public String name="BlackBread";
    /**
     当子类继承了某个类之后，便可以使用父类中的成员变量，但是并不是完全继承父类的所有成员变量。具体的原则如下：

     　　1）能够继承父类的public和protected成员变量；不能够继承父类的private成员变量；

     　　2）对于父类的包访问权限成员变量，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；

     　　3）对于子类可以继承的父类成员变量，如果在子类中出现了同名称的成员变量，则会发生隐藏现象，即子类的成员变量会屏蔽掉父类的同名成员变量。

             如果要在子类中访问父类中同名成员变量，需要使用super关键字来进行引用。

     　　2.子类继承父类的方法

     　　同样地，子类也并不是完全继承父类的所有方法。

     　　1）能够继承父类的public和protected成员方法；不能够继承父类的private成员方法；

     　　2）对于父类的包访问权限成员方法，如果子类和父类在同一个包下，则子类能够继承；否则，子类不能够继承；

     　　3）对于子类可以继承的父类成员方法，如果在子类中出现了同名称的成员方法，则称为覆盖，即子类的成员方法会覆盖掉父类的同名成员方法。如果要在子类中访问父类中同名成员方法，需要使用super关键字来进行引用。
     * */
    public BlackBread(){
        super.eat();
        //父类的构造器调用以及初始化过程一定在子类的前面
        System.out.println(super.name);
        System.out.println("BlackBread");
    }

    /**
     覆盖只针对非静态方法（终态方法不能被继承，所以就存在覆盖一说了），而隐藏是针对成员变量和静态方法的。这2者之间的区别是：覆盖受RTTI（Runtime type  identification）约束的，而隐藏却不受该约束。

     也就是说只有覆盖方法才会进行动态绑定，而隐藏是不会发生动态绑定的。在Java中，除了static方法和final方法，其他所有的方法都是动态绑定。因此，就会出现上面的输出结果。
     */

    @Override
    public void eat(){
        System.out.println("eating blackbread");
    }



}
