class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        Set<Integer> hst=new HashSet();
        for(int i:arr){
            if(hst.contains(target-i)){
                return true;
            }
            hst.add(i);
        }
        return false;
    }
}
