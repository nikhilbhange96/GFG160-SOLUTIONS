class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        
        int n= arr.length;
        int min=arr[0];
        int max=arr[0];
        int product=arr[0];
        
        for(int i=1; i<n;i++){
            if(arr[i]<0){
                int temp =max;
                max=min;
                min=temp;
            }
            min= Math.min(arr[i], min*arr[i]);
            max= Math.max(arr[i], max*arr[i]);
            
             product= Math.max(product,max);
        }
        return product;
        
    }
}
