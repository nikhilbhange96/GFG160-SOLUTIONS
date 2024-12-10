class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        int n= intervals.length;
        Arrays.sort(intervals,(a,b) ->a[1]-b[1]);
        int count=1;
        int end=intervals[0][1];
        for(int i=0; i<n; i++){
            if(intervals[i][0]>=end){
                count++;
                end=intervals[i][1];
            }
        }
        return n-count;
        
    }
}
