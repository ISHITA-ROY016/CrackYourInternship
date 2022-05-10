class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
      hm.put(0,1);
      int count=0;
      int ps=0;
      for(int num:nums){
        ps+=num;
        if(hm.containsKey(ps-k)){
          count+=hm.get(ps-k);
        }
        hm.put(ps,hm.getOrDefault(ps,0)+1);
      }
      return count;
    }
}
