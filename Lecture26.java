import java.util.ArrayList;

class Solution {
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        int sum = 0;
        
        // Finding Sum of first window
        for (int i = 0; i < K; i++) {
            sum += Arr.get(i);
        }
        
        int max = sum; // Initialize max with the sum of the first window
        
        // Slide the window over the array
        for (int i = 0; i < N - K; i++) {
            sum = sum - Arr.get(i) + Arr.get(i + K);
            if (sum > max) {
                max = sum;
            }
        }
        
        return max; // Return the maximum sum found
    }
}
