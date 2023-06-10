import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class ASSIGN2 {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        
        int maxNum = maxDifferentCandies(candyType);
        
        System.out.println("Maximum number of different candies: " + maxNum);
    }
    
    public static int maxDifferentCandies(int[] candyType) {
        int maxCandies = candyType.length / 2; // Maximum number of candies Alice can eat
        Set<Integer> uniqueCandies = new HashSet<>();
        
        for (int candy : candyType) {
            uniqueCandies.add(candy); // Add each candy type to the set (duplicates will be ignored)
            
            if (uniqueCandies.size() == maxCandies) {
                // If the set size becomes equal to the maximum allowed candies, break the loop
                break;
            }
        }
        
        return uniqueCandies.size();
    }
}
