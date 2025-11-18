class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        boolean flg=false;
        for(int i=0; i<n; i++){
            if(bits[i] == 1){
                i++;
                continue;
            }
            if(i==n-1 && bits[i]==0) flg=true;
        }
        return flg;
    }
}