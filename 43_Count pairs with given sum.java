    int countPairs(int arr[], int target) {
        // Your code here
        int count=0;
    //     Set<Integer> hst=new HashSet();
    //     for(int i:arr){
    //         if(hst.contains(target-i)){
    //             count++;
    //         }
    //         hst.add(i);
    //     }
    //   return count;
         Map<Integer,Integer> mp=new HashMap();
         for(int i:arr){
             if(mp.containsKey(target-i)){
                 count+=mp.get(target-i);
             }
             mp.put(i,mp.getOrDefault(i,0)+1);
         }
         return count;
    }
}
