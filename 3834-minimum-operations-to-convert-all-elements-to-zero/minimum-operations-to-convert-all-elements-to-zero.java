class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int operation=0;
        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() > num){
                stack.pop();
            }
            if(num==0) continue;

            if(stack.isEmpty() || stack.peek() < num ){
                operation += 1;
                stack.push(num);

            }
            
        }
        return operation;
        
    }
}