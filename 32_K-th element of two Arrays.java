class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0,j=0;
        int n=a.length, m=b.length;
        int  ans,count=0;
        
        while(true){
            int x=i<n ?a[i] : Integer.MAX_VALUE;
            int y=j<m ?b[j] : Integer.MAX_VALUE;
            
            if(x<y){
                i++;
                ans=x;
            }
            else{
                j++;
                ans=y;
            }
            count++;
            if(count==k){
                return ans;
            }
        }
    }
}
