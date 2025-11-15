class Solution {
    public int countDigits(int num){
        int digits=0;
        while(num != 0){
            digits++;
            num =num/10;
        }
        return digits;
    }
    public int findNumbers(int[] nums) {
        int countNum=0;
        for(int i=0; i<nums.length; i++){
            int countDigit = countDigits(nums[i]);
            if(countDigit%2==0){
                countNum++;
            }
        }
        return countNum;
    }
}