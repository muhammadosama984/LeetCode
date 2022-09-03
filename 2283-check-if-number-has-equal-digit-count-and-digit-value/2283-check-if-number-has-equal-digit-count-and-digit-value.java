class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i=0;i<num.length();i++){
            if(map.containsKey(num.charAt(i))){
                map.replace(num.charAt(i),map.get(num.charAt(i)), map.get(num.charAt(i))+1);
            }
            else{
            map.put(num.charAt(i), 1);
            }
        }
        for (int i=0;i<num.length();i++){
           char a = (char) (i + '0');
            int b = num.charAt(i) - '0';
            if(map.containsKey(a)){
            if(map.get(a) != b){
                return false;
            }
            }
            else {
                if (b != 0) {

                    return false;
                }
            }
        }
        return true;
    }
}