class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
         
        if(x == 0){
            return x;
        }
        if (x <= Integer.MIN_VALUE) {
           return 0;
        }
        if(x<0){
            isNegative = true; 
            x = Math.abs(x);
        }
        String s = "";
        
        while (x>0){
        int y = x%10;
        x = x / 10;
        s = s + y;
        }
         if(Long.parseLong(s) >= Integer.MAX_VALUE){
             return 0;
         }
        if (isNegative){
            return Integer.parseInt(s)*(-1);
        }
       
       return Integer.valueOf(s);
    }
    
 
}