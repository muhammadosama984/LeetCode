class Solution:
    def romanToInt(self, s: str) -> int:
        normaldic = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        prevdic = {'IV': 4, 'IX': 9, 'XL':40,'XC':90,'CD': 400, 'CM': 900}
        start = 0
        end = len(s)-1
        val = 0
        
        while(start<=end):
        
            if( ((len(s)-start) >=2) and ((s[start] + s[start+1]) in prevdic)):
                val = val + prevdic[(s[start] + s[start+1])]
                start = start + 2
            elif(s[start] in normaldic):
                val = val + normaldic[s[start]]
                start  = start + 1
        return val
        
      
            
                
                
                
            
        