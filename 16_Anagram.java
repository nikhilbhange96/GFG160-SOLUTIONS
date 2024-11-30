class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        s1= s1.toLowerCase();
        s2= s2.toLowerCase();
        
        if(s1.length()!=s2.length()){
            return false;
        } 
            char a[]=s1.toCharArray();
            char b[]=s2.toCharArray();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
    
     
        return Arrays.equals(a,b);
    }
}
