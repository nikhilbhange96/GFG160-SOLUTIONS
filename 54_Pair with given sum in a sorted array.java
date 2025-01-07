class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int i=0, j=arr.length-1;
        int count=0;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                int e1=arr[i],e2=arr[j];
                int c1=0,c2=0;
                while(i<=j && arr[i]==e1){
                    c1++;
                    i++;
                }
                while(i<=j && arr[j]==e2){
                    j--;
                    c2++;
                    
                }
                if(e1==e2){
                    count+=(c1*(c1-1))/2;
                }
                else{
                    count+=c1*c2;
                }
                
            }
        }
        return count;
    }
}
