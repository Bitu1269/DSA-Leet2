class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int len=grid[0].length;
        for(int i=0; i<grid.length; i++){
            int firstNegative=-1;
            for(int j=0; j<len; j++){
                if(grid[i][j] < 0){
                    firstNegative=j;
                    break;
                }
            }
            if(firstNegative != -1){
                count += (len - firstNegative);
            }
        }
        return count;
    }
}