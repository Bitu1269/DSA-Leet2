class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean increase = true;
        boolean decrease = true;
        for(int i=1; i<n; i++){
            if(nums[i] > nums[i-1]){
                decrease = false;
            }else if(nums[i] < nums[i-1]){
                increase=false;
            }
            if(!increase && !decrease){
                return false;
            }
        }
        return true;
    }
}