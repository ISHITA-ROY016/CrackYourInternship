class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      // int target = 0;
      LinkedList<List<Integer>> ans = new LinkedList<>();
      if(nums==null || nums.length==0){
        return ans;
      }
      Arrays.sort(nums);
      for(int i=0;i<nums.length-1;i++){
        int target = 0-nums[i];
        int first = i+1;
        int last = nums.length-1;
        while(first<last){
          if(nums[first]+nums[last]<target){
            first++;
          }else if(nums[first]+nums[last]>target){
            last--;
          }else{
            List<Integer> res = new LinkedList<>();
            res.add(nums[i]);
            res.add(nums[first]);
            res.add(nums[last]);
            ans.add(res);
            
            while(first<last && nums[first]==res.get(1)){
              first++;
            }
            while(first<last && nums[last]==res.get(2)){
              last--;
            }
          }
        }
        while(i+1<=nums.length-1 && nums[i]==nums[i+1]){
          i++;
        }
      }
      return ans;
    }
}
