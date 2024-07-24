package abstraction;

abstract class Car {
    int maxspeed;
    abstract void accelarate();
    abstract void brake();
}

abstract class A {
    int X = 10;
    void fun() {
        System.out.println("Hello, I'm A");
    }
}

abstract class BMW extends Car {
    void accelarate() {
        System.out.println("BMW is accelarating");
    }
}

class BMW2 extends BMW {
    void brake() {
        System.out.println("BMW is braking");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {
        // Cannot instantiate the type Car as it's abstract
        // Car c = new Car(); 

        // Cannot instantiate the type BMW as it's abstract
        // BMW beemer = new BMW();

        BMW2 b = new BMW2();
        b.accelarate();
        b.brake();
    }
}
