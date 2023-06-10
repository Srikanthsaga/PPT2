public class Assign4 {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        
        boolean canPlant = canPlaceFlowers(flowerbed, n);
        
        System.out.println("Can plant new flowers: " + canPlant);
    }
    
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Count of newly planted flowers
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Check if the current plot and its adjacent plots are empty
                flowerbed[i] = 1; // Plant a flower
                count++; // Increment the count of newly planted flowers
            }
            
            if (count >= n) {
                // If the required number of flowers have been planted, return true
                return true;
            }
        }
        
        return false;
    }
}

