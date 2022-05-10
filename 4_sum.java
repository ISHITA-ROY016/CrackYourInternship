class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
     return kSum(nums,0,4,target);
    }
  public List<List<Integer>> kSum(int[] nums, int start, int k, int target){
    List<List<Integer>> ans = new LinkedList<>();
    if(start==nums.length){
      return ans;
    }
    int rem = target/k;
    if(nums[start]>rem || rem>nums[nums.length-1]){
      return ans;
    }
    if(k==2){
      return twoSum(nums,target,start);
    }
    for(int i=start;i<nums.length;i++){
      if(i==start || nums[i-1]!=nums[i]){
        for(List<Integer> res:kSum(nums,i+1,k-1,target-nums[i])){
          ans.add(new LinkedList<>(Arrays.asList(nums[i])));
          ans.get(ans.size()-1).addAll(res);
        }
      }
    }
    return ans;
  }
  public List<List<Integer>> twoSum(int[] nums, int target, int start) {
        List<List<Integer>> res = new ArrayList<>();
        int lo = start, hi = nums.length - 1;
        while (lo < hi) {
            int currSum = nums[lo] + nums[hi];
            if (currSum < target || (lo > start && nums[lo] == nums[lo - 1])) {
                ++lo;
            } else if (currSum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[lo++], nums[hi--]));
            }
        }
    return res;
    }
}


