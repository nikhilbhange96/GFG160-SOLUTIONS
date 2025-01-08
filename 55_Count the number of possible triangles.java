class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            int j=0;int k=i-1;
            while(j<k){
                int sum=arr[j]+arr[k];
                if(sum>arr[i]){
                    count+=k-j;
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        return count;
    }
}
