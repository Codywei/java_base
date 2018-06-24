/**
 类的继承

 子类是不能够继承父类的构造器，但是要注意的是，如果父类的构造器都是带有参数的，则必须在子类的构造器中显示地通过super关键字调用父类的构造器并配以适当的参数列表。

 如果父类有无参构造器，则在子类的构造器中用super关键字调用父类构造器不是必须的，如果没有使用super关键字，系统会自动调用父类的无参构造器。
 * */

public class inherit {
    class Shape {

        protected String name;

       public Shape(){
            name = "shape";
       }

        public Shape(String name) {
            this.name = name;
        }
    }

    class Circle extends Shape {

        private double radius;

        public Circle() {
            super();
            radius = 0;
        }

        public Circle(double radius) {
            super("circle");
            this.radius = radius;
        }

        public Circle(double radius,String name) {
            super(name);
            this.radius = radius;
            this.name = name;
        }
    }
}
