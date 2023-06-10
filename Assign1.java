import java.util.Arrays;

public class Assign1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]); // Add the minimum value of each pair to the sum
        }
        
        return sum;
    }


public static class Main {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        
        Assign1 solution = new Assign1();
        int maxSum = solution.arrayPairSum(nums);
        
        System.out.println("Maximum sum: " + maxSum);
    }
}
}


