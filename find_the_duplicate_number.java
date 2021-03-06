class Solution {
    public int findDuplicate(int[] nums) {
      Set<Integer> seen = new HashSet<Integer>();
      for(int i:nums){
        if(seen.contains(i)){
          return i;
        }
        seen.add(i);
      }
      return -1;
    }
}
