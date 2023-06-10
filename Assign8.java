import java.util.Arrays;

public class Assign8 {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        
        int minScore = minimumScore(nums, k);
        
        System.out.println("Minimum score: " + minScore);
    }
    
    public static int minimumScore(int[] nums, int k) {
        int n = nums.length;
        
        if (n == 1) {
            return 0; // If there is only one element, the score is always 0
        }
        
        Arrays.sort(nums); // Sort the array in ascending order
        
        int min = nums[0] + k; // Increase the minimum element by k
        int max = nums[n - 1] - k; // Decrease the maximum element by k
        
        int score = nums[n - 1] - nums[0]; // Initial score
        
        // Check if the adjusted minimum is greater than the adjusted maximum
        if (min > max) {
            return score; // No operation needed, return the initial score
        } else {
            return Math.min(score, max - min); // Return the minimum score after adjusting min and max
        }
    }
}
