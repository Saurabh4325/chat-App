package arrays;

public class TwoPointerConcept {
    public static void main(String[] args) {
        int arr[] = {10, 20, 35, 50, 75, 80};
        int x = 95;
        int l = 0;
        int r = arr.length - 1;
        boolean found = false; // flag
        while (l < r) {
            int Sum = arr[l] + arr[r];
            if (Sum == x) {
                System.out.println("Found " + x + " as sum of values on index: " + l + " and index: " + r);
                found = true;
                break;
            } else if (Sum < x) {
                l++;
            } else { // Sum > x
                r--;
            }
        }
        if (!found) {
            System.out.println("Sum not found");
        }
    }
}
