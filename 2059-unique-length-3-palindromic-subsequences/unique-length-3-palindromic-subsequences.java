class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        if (n < 3) return 0;

        int[] suf = new int[n];
        int mask = 0;

        for (int i = n - 1; i >= 0; i--) {
            mask |= 1 << (s.charAt(i) - 'a');
            suf[i] = mask;
        }

        boolean[][] used = new boolean[26][26];
        int leftMask = 0;

        for (int j = 1; j < n - 1; j++) {
            leftMask |= 1 << (s.charAt(j - 1) - 'a');
            int both = leftMask & suf[j + 1];
            int mid = s.charAt(j) - 'a';

            for (int c = 0; c < 26; c++) {
                if ((both & (1 << c)) != 0) {
                    used[c][mid] = true;
                }
            }
        }

        int ans = 0;
        for (int a = 0; a < 26; a++) {
            for (int b = 0; b < 26; b++) {
                if (used[a][b]) ans++;
            }
        }

        return ans;
    }
}