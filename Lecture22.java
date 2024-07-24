package strings;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; // created using String literals stored in the method area.
        String name2 = "CipherSchools";
        String name3 = new String("CipherSchools"); // creating string using constructors.
        String name4 = new String("CipherSchools");

        // Using == operator to compare references
        System.out.println(name == name2); // true, same reference for string literals
        System.out.println(name3 == name4); // false, different objects
        System.out.println(name == name3); // false, different objects
        
        // Strings are immutable
        // Every time we perform an operation on a string, a new object is created.
        System.out.println("-----------------------------------------------");

        // 1. Concatenation
        String s1 = "Hello";
        s1 = s1 + " peeps";
        System.out.println(s1); // Hello peeps
        System.out.println(s1 + " how're you doing"); // Hello peeps how're you doing
        System.out.println(s1); // Hello peeps (s1 remains the same)

        // Another way to concatenate is to use the concat() method
        String s2 = new String("Hello");
        String s3 = new String(" peeps");
        String s4 = s2.concat(s3);
        System.out.println(s4); // Hello peeps
        System.out.println(s2); // Hello (s2 remains the same)

        // 2. Checking if strings are equal in value
        // equals() method -> from Object class.
        // This generally compares references (hashcodes of objects just like ==)
        // But, for the String class, it has been overridden to check for content equality
        System.out.println(name.equals(name2)); // true
        System.out.println(name.equals(name3)); // true

        // 3. Creating a new string object from a character array
        char arr[] = {'c', 'i', 'p', 'h', 'e', 'r'};
        String strFromArr = new String(arr); // constructor overload
        System.out.println(strFromArr); // cipher
    }
}
