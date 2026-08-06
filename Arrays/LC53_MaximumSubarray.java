class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(curr + nums[i] > nums[i]){
                curr = curr + nums[i];
            } else {
                curr = nums[i];
            }

            if(curr > max){
                max = curr;
            }
        }

        return max;
    }
}