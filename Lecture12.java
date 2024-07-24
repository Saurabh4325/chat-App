
Package 1: Shape and Circle

package abstraction;

interface Shape {
    double pi = 3.14;
    double getSquare(double r);
}

class Circle implements Shape {
    @Override
    public double getSquare(double r) {
        return pi * r * r; // Calculating the area of a circle
    }

    void fun() {
        System.out.println("Hey, I implemented an interface named Shape");
    }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}



Package 2: Multiple Inheritance

package abstraction;

interface M {
    int x = 10;
    void fun();
}

interface N {
    int x = 20;
    void fun();
}

class C implements M, N {
    @Override
    public void fun() {
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x); // Resolving ambiguity by specifying the interface
        System.out.println(N.x); // Resolving ambiguity by specifying the interface
    }
}

interface O extends M, N {
    @Override
    void fun();
}

class D implements O {
    @Override
    public void fun() {
        System.out.println("Hello, I'm function in D");
    }
}

public class MultipleInheritanceStudy {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
        D d = new D();
        d.fun();
    }
}


