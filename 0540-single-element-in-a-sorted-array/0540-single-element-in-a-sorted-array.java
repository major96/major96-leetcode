class Solution {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 0; 2 * i < nums.length - 1; i++){
            if(nums[2 * i] != nums[2*i + 1]){
                return nums[2*i];
            }
        }
        return nums[nums.length - 1];
    }
}