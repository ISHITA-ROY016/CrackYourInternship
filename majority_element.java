class Solution {
    public int majorityElement(int[] nums) {
        int ans=nums.length/2;
      for(int num:nums){
        int count = 0;
        for(int i:nums){
          if(i==num){
            count+=1;
          }
        }
        if(count>ans){
          return num;
        }
      }
      return -1;
    }
}
