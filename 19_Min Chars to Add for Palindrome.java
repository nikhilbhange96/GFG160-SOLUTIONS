class Solution {
    public static int minChar(String s) {
        String reversed = new StringBuilder(s).reverse().toString();  
        
        String str = s +"#"+ reversed; 


        int[] arr = Calculate(str);  
        
        int ans = arr[str.length()-1]; 
     

        return s.length()-ans;  
        
    }

   
    private static int[] Calculate(String str) {
        int n = str.length();
        int[] arr = new int[n];
        int length = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i)==str.charAt(length)) {
                length++;
                arr[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = arr[length - 1]; 
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }
        return arr;
    }
}
