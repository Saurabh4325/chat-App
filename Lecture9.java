// Student Class

package CoreJava;

public class Students {
    int rollNo; // camel casing
    String name;

    public static void main(String[] args) {
        Students S1 = new Students();
        Students S2 = new Students();
        Students S3 = new Students();

        S1.name = "Ram";
        S1.rollNo = 1;
        S2.name = "Sham";
        S2.rollNo = 2;
        S3.name = "Ram";
        S3.rollNo = 1;

        System.out.println(S1.name);
        System.out.println(S1.rollNo);
        System.out.println(S2.name);
        System.out.println(S2.rollNo);
        System.out.println(S3.name);
        System.out.println(S3.rollNo);
    }
}


//Shape.java:

class Shape {
    double pi = 3.14;

    double getSquare(int r) {
        return r * r;
    }
}


//Circle.java:

class Circle extends Shape {
    void area(int r) {
        System.out.println(pi * getSquare(r));
    }
}


//InheritanceStudy.java:

public class InheritanceStudy {
    public static void main(String[] args) {
        Circle C = new Circle();
        C.area(5);
    }
}

