package coreJava;

public class TimeComplexity {
    static boolean isPrimeRam(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPrimeSham(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        long start = System.currentTimeMillis(); // note time before function executed
        System.out.println(isPrimeRam(n));
        long end = System.currentTimeMillis(); // note time after function executed
        System.out.println("Time by Ram's approach: " + (end - start) + " ms"); // this is the time taken by the function

        start = System.currentTimeMillis(); // reset start time for the second function
        System.out.println(isPrimeSham(n));
        end = System.currentTimeMillis(); // note time after function executed
        System.out.println("Time by Sham's approach: " + (end - start) + " ms"); // this is the time taken by the second function
    }
}
