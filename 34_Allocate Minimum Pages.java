class Solution {
  static boolean isPossible(int[] arr, int k, int max) {
        int total = 1; 
        int sum = 0;

        for(int i : arr) {
            sum+=i;

            if (sum>max) { 
                total++;
                sum=i;
                if(total>k) {
                    return false;
                }
            }
        }
        return true; 
    }
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        
        if(k > n) {
            return -1;
        }
        int beg=0, end=0;
        
        for(int i : arr) {
            beg = Math.max(beg, i); 
            end+=i;              
        }
        
        int ans = beg;
        
        while(beg <= end) {
            int mid = (beg+end)/2;
            
            if(isPossible(arr,k,mid)) {
                ans = mid;       
                end = mid-1;   
            } else {
                beg = mid+1;   
            }
        }
        return ans;
    }

  
}
