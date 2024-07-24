Package: arrays:

package arrays;

public class ArrayStudy {
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Array Creation Expression
        int size = 5;
        int arr[] = new int[size]; // combination of declaration and object creation
        // int arr[], int[] arr, int []arr => all are the same.
        // arr = new int[size]; => creation of object.
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        print(arr);

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        print(arr);

        // 2. Array initializers list
        int arr2[] = {1, 2, 3};
        print(arr2);

        // If we want to increase the size of an array
        int copyArray[] = new int[2 * size]; // create an array of double size
        for (int i = 0; i < size; i++) { // copy all elements from old to new array
            copyArray[i] = arr[i];
        }
        copyArray[5] = 6;
        copyArray[6] = 7;
        print(copyArray);
    }
}


Class: PassingArray:

package arrays;

public class PassingArray {
    static void addOne(int x) {
        x = x + 1;
    }

    static void addOne(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        addOne(x);
        System.out.println(x); // x will still be 10 because primitive types are passed by value

        int arr[] = {1, 2, 3, 4, 5};
        addOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}




