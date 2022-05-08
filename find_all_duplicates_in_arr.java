class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> ht = new HashMap<>();
      LinkedList<Integer> ans = new LinkedList<>();
      for(int i=0;i<nums.length;i++){
        if(ht.containsKey(nums[i])){
          ans.add(nums[i]);
        }
        else{
          ht.put(nums[i],1);
        }
      }
      return ans;
    }
}
