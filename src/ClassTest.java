public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

        new Meal();
    }
}


class Meal {

    public Meal() {
        System.out.println("meal");
    }

    Bread bread = new Bread();
}

class Bread {

    public Bread() {
        System.out.println("bread");
    }
}

