class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        
       int n= arr.length;
       int count0=0;
       int count1=0;
       int count2=0;
       
       for(int i=0; i<n; i++){
           if(arr[i]==0){
               count0++;
           }
           else if(arr[i]==1){
               count1++;
           }
           else
           count2++;
       }
       int j=0;
       for(int i=0; i<count0;i++){
           arr[j]=0;
           j++;
       }
       for(int i=0; i<count1; i++){
           arr[j]=1;
           j++;
           
       }
       for(int i=0; i<count2;i++){
           arr[j]=2;
           j++;
       }
       
    }
}
