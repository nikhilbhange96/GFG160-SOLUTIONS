class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans=new ArrayList();
        int currSum=0;
        int left=0;
        for(int right=0; right<arr.length; right++){
            currSum+=arr[right];
            
            while(currSum>target && left<=right){
                currSum-=arr[left];
                left++;
            }
            if(currSum==target){
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
