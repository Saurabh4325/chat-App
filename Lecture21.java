//SelectionSort:

package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 7, 10, 11, 4, 1};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { // Fixed the loop condition
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


//StringStudy

package strings;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; // created using String literals stored in method area
        String name2 = "CipherSchools";
        String name3 = new String("CipherSchools"); // creating string using constructors
        String name4 = new String("CipherSchools");

        System.out.println(name == name2); // == operator compares references for objects and values for primitive data types
        System.out.println(name3 == name4); // False, because they are different objects
        System.out.println(name == name3); // False, different references

        // Strings are immutable
        // Every time we do an operation on a string, a new object is created
        System.out.println("-----------------------------------------------");

        // 1. Concatenation
        String s1 = "Hello";
        s1 = s1 + " peeps";
        System.out.println(s1);
        System.out.println(s1 + " how're you doing"); // s1 remains same

        // Another way to concatenate is to use the function
        String s2 = new String("Hello");
        String s3 = new String(" peeps");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2); // remains same

        // 2. Checking if strings are equal in value
        // equals function -> object class
        // this generally

