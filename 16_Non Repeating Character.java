
class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        int frq[]=new int[26];
        
        for(char ch:s.toCharArray()){
            frq[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            if(frq[ch-'a']==1){
                return ch;
            }
        }
        return '$';
    }
}
