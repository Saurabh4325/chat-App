package strings;

public class ReverseAString {
    public static void main(String[] args) {
        String s1 = "CipherSchools";

        // Approach 1
        int n = s1.length();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s1.charAt(n - 1 - i);
        }
        // arr has reversed string
        String rev = new String(arr);
        System.out.println("Approach 1: " + rev);
        // Time complexity: O(n)
        // Is it an in-place solution? => no, we created arr[]
        // Space complexity: O(n) => for arr[n]

        // Approach 2
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            res = res + s1.charAt(i); // Tc=>O(n) => but creating new objects again and again
        }
        System.out.println("Approach 2: " + res);

        // Approach 3
        char strArr[] = s1.toCharArray();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;
            l++;
            r--;
        }
        // swapping completed
        String result = new String(strArr);
        System.out.println("Approach 3: " + result);
    }
}
