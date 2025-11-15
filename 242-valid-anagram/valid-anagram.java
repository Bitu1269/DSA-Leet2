class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;

        }
        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){  // adding char in count array
            count[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){ //removeing char from array
            count[t.charAt(i) -'a']--;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]!=0){ //if count array is zero means the length is same of both string
                return false;
            }
        }
        return true;
    }
}