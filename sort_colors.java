class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
      int max=nums[0];
      for(int i=1;i<nums.length;i++){
        if(nums[i]>max){
          max=nums[i];
        }
      }
      countsort(nums,n,max);
    }
  public void countsort(int[] nums, int n, int max){
    int[] o = new int[n+1];
    int[] count = new int[max+1];
    for(int i=0;i<=max;i++){
      count[i]=0;
    }
    for(int i=0;i<nums.length;i++){
      count[nums[i]]++;
    }
    for(int i=1;i<=max;i++){
      count[i]+=count[i-1];
    }
    for(int i=n-1;i>=0;i--){
      o[count[nums[i]]-1]=nums[i];
      count[nums[i]]--;
    }
    for(int i=0;i<n;i++){
      nums[i]=o[i];
    }
  }
}
