class Solution {
    public int myAtoi(String s) {
        // Your code here
        int n= s.length();
        int sign=1;
        int ans=0;
        int i=0;
        
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i < n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i) - '0';
            
            if(ans>(Integer.MAX_VALUE-digit)/10){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10+digit;
            i++;
        }
        return ans*sign;
    }
}
