class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length;
        int maxLength=0,sum=0;
        
        Map<Integer,Integer> mp=new HashMap();
        
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                arr[i]=-1;
                
            }
            else{
                arr[i]=1;
            }
            
        }
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum==0){
                maxLength=i+1;
            }
            if(mp.containsKey(sum)){
                maxLength=Math.max(maxLength, i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
            
        }
        return maxLength;
    }
}
