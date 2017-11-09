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
