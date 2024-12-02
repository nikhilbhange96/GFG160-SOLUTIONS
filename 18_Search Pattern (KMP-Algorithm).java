class Solution {
    void calculate(String pat,int[] arr){
        int n= pat.length();
        int l=0;
        int i=1;
        
        while(i<n){
            if(pat.charAt(i)==pat.charAt(l)){
                l++;
                arr[i]=l;
                i++;
            }
            else{
                if(l!=0){
                    l=arr[l-1];
                }
                else
                   arr[i]=0;
                   i++;
            }
        }
    }

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> list= new ArrayList();
        int j=0;
        int f=0;
        int i=0;
        int arr[]= new int[pat.length()];
        calculate(pat,arr);
        int n= txt.length();
        while(i<n){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==pat.length()){
                f++;
                list.add(i-j);
                j=arr[j-1];
            }
            else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=arr[j-1];
                    
                }
                else 
                i=i+1;
            }
        }
        return list;
    }
}
