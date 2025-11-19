class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true) {
            boolean found = false;
            for(int num : nums) {
                if(num == original) {
                    found = true;
                    break;
                }
            }
            if(found) {
                original = original * 2;
            } else {
                break;
            }
        }
        return original;
    }
}
