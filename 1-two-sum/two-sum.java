class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                // Check if the sum of the current pair equals the target
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i}; // Return indices of the matching pair
                }
            }
        }
        return new int[]{}; 
    }
}