import java.util.HashMap;

public class twosum {
    public static int[] TwoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement
            
            // Check if the complement exists in the HashMap
            if (numToIndex.containsKey(complement)) {
                // If found, return the indices
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the HashMap
            numToIndex.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array (though the problem states there is one)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum(nums, target);
        
        // Print the result
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Output: [0, 1]
    }
}