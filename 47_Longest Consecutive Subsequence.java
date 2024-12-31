class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> hst=new HashSet();
        for(int i:arr){
            hst.add(i);
        }
        int ans=0;
        for(int i:arr){
            int count=0,temp=i,temp2=i-1;
            if(hst.contains(i)){
                while(hst.contains(temp)){
                    count++;
                    hst.remove(temp);
                    temp++;
                }
                while(hst.contains(temp2)){
                    count++;
                    hst.remove(temp2);
                    temp2--;
                }
            }
            ans=Math.max(ans,count);
            
        }
        return ans;
    }
}
