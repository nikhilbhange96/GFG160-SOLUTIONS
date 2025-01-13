class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int maxWater=0;
        int st=0; int end=arr.length-1;
        while(st<end){
            int w=end-st;
            int h=Math.min(arr[st], arr[end]);
            int area=h*w;
            maxWater=Math.max(maxWater,area);
            
            if(arr[st]<arr[end]){
                st++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
}
