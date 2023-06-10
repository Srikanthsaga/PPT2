
import java.util.Arrays;

public class Assign5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        
        int maxProduct = maximumProduct(nums);
        
        System.out.println("Maximum product: " + maxProduct);
    }
    
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        
        int n = nums.length;
        
        // Return the maximum of two possible products:
        // 1. The product of the three largest elements
        // 2. The product of the two smallest elements and the largest element
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}
