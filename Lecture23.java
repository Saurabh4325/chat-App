package strings;

import java.util.Scanner;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; // Created using String literals, stored in method area.
        String name2 = "CipherSchools";
        String name3 = new String("CipherSchools"); // Creating string using constructors.
        String name4 = new String("CipherSchools");
        
        System.out.println(name == name2); // == operator compares references for objects and values for primitive data types.
        System.out.println(name3 == name4);
        System.out.println(name == name3);
        
        // Strings are immutable
        // Every time we do an operation on a string, a new object is created.
        System.out.println("-----------------------------------------------");
        System.out.println("Creating partial string object from character array");
        
        char[] arr = {'C', 'i', 'p', 'h', 'e', 'r', 'S', 'c', 'h', 'o', 'o', 'l', 's'};
        String partialStrFromArr = new String(arr, 1, 3);
        // We can pass an array, starting index (included), count of elements after starting index.
        System.out.println(partialStrFromArr);
        
        String partialStrFromArr2 = new String(arr, 2, 3);
        System.out.println(partialStrFromArr2);
        
        // Changing the case
        System.out.println("-----------------------------------------------");
        System.out.println("Changing the case");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name); // Remains the same since strings are immutable
        
        // Splitting
        System.out.println("-----------------------------------------------");
        System.out.println("Splitting");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String fullName = sc.nextLine(); // CipherSchools welcomes you
        String[] strArr = fullName.split(" ");
        for (String str : strArr) {
            System.out.println(str);
        }
        
        System.out.println("Please enter something separated by commas:");
        String csvText = sc.nextLine();
        String[] csvArr = csvText.split(",");
        for (String str : csvArr) {
            System.out.println(str);
        }
        
        System.out.println("Please enter something separated by dots:");
        String dotText = sc.nextLine();
        String[] dotArr = dotText.split("\\.");
        for (String str : dotArr) {
            System.out.println(str);
        }
        
        String backSlashText = "Hello,I attend \"Java\" class";
        String[] backSlashArr = backSlashText.split("\\\"");
        for (String str : backSlashArr) {
            System.out.println(str);
        }
        
        // Length of string
        System.out.println("-----------------------------------------------");
        System.out.println("Length of string");
        int len = name.length();
        System.out.println("Length of " + name + " is: " + len);
        
        // Finding index of a char in a string
        System.out.println("-----------------------------------------------");
        System.out.println("Finding index of a char in a string");
        int index = name.indexOf('e'); // Return first occurrence of that character.
        System.out.println("Index of 'e' in " + name + " is: " + index);
        
        int index2 = name.indexOf('E'); // Return -1 if not found
        System.out.println("Index of 'E' in " + name + " is: " + index2);
        
        int index3 = name.indexOf("Schools"); // Return first occurrence of that String.
        System.out.println("Index of \"Schools\" in " + name + " is: " + index3);
        
        int index4 = name.indexOf('o', 10); // Start searching from index 10, 10 included
        System.out.println("Index of 'o' in " + name + " starting from index 10 is: " + index4);
        
        int indexOfO = 0;
        while (indexOfO != -1) { // Stop at -1 or run till not -1
            indexOfO = name.indexOf('o', indexOfO + 1);
            if (indexOfO == -1) break;
            System.out.println("o found at: " + indexOfO);
        }
        
        sc.close();
    }
}
