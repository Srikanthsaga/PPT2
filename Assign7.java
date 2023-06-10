
public class Assign7 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        
        boolean isMonotonic = isMonotonic(nums);
        
        System.out.println("Is monotonic: " + isMonotonic);
    }
    
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true; // Flag to track if the array is monotone increasing
        boolean decreasing = true; // Flag to track if the array is monotone decreasing
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                increasing = false; // Found a decreasing element, array is not monotone increasing
            }
            
            if (nums[i] > nums[i - 1]) {
                decreasing = false; // Found an increasing element, array is not monotone decreasing
            }
        }
        
        return increasing || decreasing; // Return true if either flag is true, indicating the array is monotonic
    }
}
