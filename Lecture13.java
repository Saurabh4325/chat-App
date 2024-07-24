Package 1: Access Modifiers in accessModifier1:

package accessModifier1;

public class A {
    int x = 10; // default or package-private
    private int y = 15;
    public int z = 20;
    protected int w = 25;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);
        System.out.println(obj.y); // private accessible within the same class
        System.out.println(obj.z); // public accessible everywhere the object is available
        System.out.println(obj.w); // protected accessible within the same package and in subclasses
    }
}

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x); // default is accessible in the same package
        // System.out.println(obj.y); // private not accessible outside the class, commented out
        System.out.println(obj.z); // public accessible everywhere the object is available
        System.out.println(obj.w); // protected accessible within the same package
    }
}


Package 2: Access Modifiers in accessModifier2:

package accessModifier2;

import accessModifier1.A;

public class C extends A {
    public static void main(String[] args) {
        C childObj = new C();
        // System.out.println(childObj.x); // default is not accessible outside the package, commented out
        System.out.println(childObj.z); // public accessible everywhere the object is available
        System.out.println(childObj.w); // protected visible in different package in subclass
        // System.out.println(childObj.y); // private not visible, commented out
    }
}

public class D {
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.x); // default is not accessible outside the package, commented out
        // System.out.println(obj.y); // private not accessible outside the class, commented out
        System.out.println(obj.z); // public accessible everywhere the object is available
        // System.out.println(obj.w); // protected not accessible outside package in non-subclass, commented out
    }
}



Encapsulation Example:

package encapsulation;

class Demo {
    private int a;
    private int b;
    private int c;
    private int d;

    public int getA() {
        System.out.println("Value of A read");
        return this.a;
    }

    public int getB() {
        System.out.println("Value of B read");
        return this.b;
    }

    public int getC() { // only read
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        if (a > 100) {
            this.a = a;
            System.out.println("Value of A changed to " + a);
        } else {
            System.out.println("Cannot set value outside limits");
        }
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
}

public class EncapStudy {
    public static void main(String[] args) {
        Demo d = new Demo();
        // System.out.println(d.a); // not visible because private, commented out

        d.setA(150);
        System.out.println(d.getA());

        d.setB(200);
        System.out.println(d.getB());

        d.setC(300);
        System.out.println(d.getC());

        d.setD(400);
        System.out.println(d.getD());
    }
}


