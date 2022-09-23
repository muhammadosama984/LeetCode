class Solution {
    public String longestCommonPrefix(String[] s) {
        if (s.length == 0) {
           return "";
          
        }
        String ans = s[0];
        char[] firstArray = ans.toCharArray();

        if (s.length == 1) {
           return s[0];
         
        }

        for (int i = 0; i < s.length; i++) {
            char[] currentArray = s[i].toCharArray();
            if (s[i].length() <= ans.length()) {
                int j = 0;
                for (; j < s[i].length(); j++) {
                    if (firstArray[j] != currentArray[j]) {
                        ans = ans.substring(0, j);
                        break;
                    }
                }
                if (j == s[i].length()) {
                    ans = ans.substring(0, s[i].length());
                }
            } else {
                for (int j = 0; j < ans.length(); j++) {
                    if (firstArray[j] != currentArray[j]) {
                        ans = ans.substring(0, j);
                    }
                }
            }

        }
        return ans;
    }
}