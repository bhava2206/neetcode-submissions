class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(h.containsKey(diff) && h.get(diff)!=i ){
                return new int[]{i,h.get(diff)};
            }
        }
        return new int[0];
    }
}
