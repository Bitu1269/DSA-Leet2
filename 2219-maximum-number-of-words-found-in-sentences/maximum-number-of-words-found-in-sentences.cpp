class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int maxLength =0;
        for(string s : sentences){
            int count =1;
            for(int i=0; i<s.size(); i++){
                if(s[i] == ' ') count++;
            }
            maxLength = max(maxLength, count);
        }
        return maxLength;
    }
};