package Keywords;

class loan {
    int rate;
    
    loan() {
        System.out.println("Hi, I'm the default constructor of loan");
    }
    
    loan(int rate) {
        this.rate = rate;
    }
    
    void printRate() {
        System.out.println(this.rate);
    }
}

class carloan extends loan {
    int rate;
    
    carloan() {
        super();
        System.out.println("Hi, I'm the default constructor of carloan");
        // You cannot directly access 'super.rate' like this if 'rate' is hidden.
        System.out.println(super.rate);
    }
    
    carloan(int rate) {
        super(7);
        this.rate = rate;
    }
    
    void printRate() {
        System.out.println(this.rate);
        super.printRate();
        System.out.println(super.rate);
    }
}

public class SuperStudy {
    public static void main(String[] args) {
        carloan cl2 = new carloan();
        carloan cl = new carloan(8);
        cl.printRate();
    }
}



package keywords;

class A {
    final int noOfAlphabets = 26; // final variables - value once assigned cannot be changed.
    final int noOfDigits;
    
    // Either assign the value at time of declaration or assign the value inside the constructor.
    A() {
        noOfDigits = 10;
    }
    
    final void fun() {
        System.out.println("Hi, I'm a function in class A");
    }
}

class B extends A {
    // The following method cannot override the final method from A.
    // void fun() {
    //    System.out.println("I'm a function in B overriding function in A");
    // }
}

// Final classes cannot be inherited.
final class BFinal extends A {}

// The following class cannot extend a final class.
// class C extends BFinal {}

public class FinalStudy {
    public static void main(String[] args) {
        // This space can be used for testing.
    }
}

