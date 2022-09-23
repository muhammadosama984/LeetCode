class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int max = 0;
        String ans = "";

        for (int i = 0; i < array.length; i++) {
            ans = "";
            ans = ans + array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (ans.contains(String.valueOf(array[j]))) {
                    if (ans.length() > max) {
                        max = ans.length();
                    }
                    ans = "";
                    break;

                } else {
                    ans = ans + array[j];
                }
            }
            if (ans.length() > max) {
                max = ans.length();
            }

        }

        return max;
    }
}