class Solution {
    public int countElements(int[] nums) {
        int i=0,j=nums.length-1;
        Arrays.sort(nums);

        int small=nums[0];
        while(i < nums.length){
            if(nums[i]>small){
                break;
            }
            i++;
        }
        
            
        int large=nums[j];
        while(j >= 0){
            if(large > nums[j]){
                break;
            }
            j--;
        }
        
        if(i>j){
            return 0;
        }else{
            return j-i+1;
        }
    }
}