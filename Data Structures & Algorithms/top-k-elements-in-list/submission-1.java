class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num:nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>(h.keySet());
        // Collections.sort(res);/
        Collections.sort(res, (a, b) -> h.get(b) - h.get(a));
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
