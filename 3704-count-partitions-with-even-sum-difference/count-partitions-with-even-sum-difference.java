class Solution {
    public int countPartitions(int[] nums) {
        int n= nums.length;
        int leftSum=0;
        int count = 0;

        for(int i=0; i<n-1; i++){
            leftSum += nums[i];
            int rightSum=0;
            for(int j=i+1; j<n; j++){
                rightSum += nums[j];
            }
            int diff=leftSum-rightSum;
            if(diff %2==0){
                count++;
            }
        }
        return count;
    }
}