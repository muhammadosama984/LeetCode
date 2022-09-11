class Solution {
    public int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        int count = 0;
        int end = array.length-1;
        if(array[end] == ' '){
            while(array[end] == ' '){
                end--;
            }
        }
        
        while ((end >= 0) && (array[end] != ' ')){
            count++;
            end--;
        }
        return count;
    }
}