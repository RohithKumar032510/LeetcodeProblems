class Solution{
    public int removeDuplicates(int[] nums){
      int a=1;
      for(int i=1;i<nums.length;i++){
          if(nums[i-1]!=nums[i]){
              nums[a]=nums[i];     
              a++;
          }
        }
        return a;
    }
}
