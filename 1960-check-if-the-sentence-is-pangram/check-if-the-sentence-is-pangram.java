class Solution {
    public boolean checkIfPangram(String s) {
        // boolean[] visit=new boolean[26];

        // for(int i=0; i<s.length(); i++){
        //     char ch=s.charAt(i);
        //     visit[ch - 'a']=true;
        // }

        // for(int i=0; i<26; i++){
        //     if(visit[i] == false){
        //         return false;
        //     }
        // }
        // return true;

        HashSet<Character> set = new HashSet<>();

        // for(char ch: s.toCharArray()){
        //     set.add(ch);
        // }
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size()==26;
    }
}