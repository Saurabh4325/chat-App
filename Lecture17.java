package arrays;

public class JaggedArrays {
    static void printJaggedArray(int arr[][]) {
        // Printing jagged array properly
        // All rows in separate lines
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        printJaggedArray(arr);

        int arr2[][] = new int[3][];
        arr2[0] = new int[]{1, 2, 3};
        arr2[1] = new int[]{2, 3};
        arr2[2] = new int[]{4, 5, 6};

        System.out.println("****_____******_______******________*****");
        printJaggedArray(arr2);
    }
}

package CoreJava;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String firstName = sc.next(); // it will take input till a space occurs
        String lastName = sc.next();
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);

        System.out.println("Please enter your profession: ");
        String profession = sc.next();
        System.out.println("Profession: " + profession);

        System.out.println("Please enter your address: ");
        sc.nextLine(); // consume the leftover newline
        String address = sc.nextLine();
        System.out.println("Address: " + address);

        System.out.println("Please enter your house number: ");
        int number = sc.nextInt();
        System.out.println("HouseNumber: " + number);
    }
}


package CoreJava;

import java.util.Scanner;

public class ScannerStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);

        System.out.println("Please enter your profession: ");
        String profession = sc.nextLine();
        System.out.println("Profession: " + profession);

        System.out.println("Please enter your address: ");
        String address = sc.nextLine();
        System.out.println("Address: " + address);

        System.out.println("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("HouseNumber: " + number);
    }
}
