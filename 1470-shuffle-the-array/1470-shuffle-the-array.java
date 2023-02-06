class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 2){
            return nums;
        }
        int result[] = new int[2*n];
        result[0] = nums[0]; result[1] = nums[n];
        for(int i = 2; i < result.length; i++){
            if(i%2 == 1){
                result[i] = nums[(i-1)/2 + n];
            }else {
                result[i] = nums[i/2];
            }
        }
        return result;
    }
}