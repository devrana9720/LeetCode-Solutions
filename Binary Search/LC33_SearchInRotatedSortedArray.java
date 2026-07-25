class Solution {
    public int search(int[] nums, int target) {
        int le=0;
        int right=nums.length-1;
        while(le<=right){
            int mid=(le+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[le]<=nums[mid]){
                if(nums[le]<=target && target<=nums[mid]){
                    right=mid-1;
                }
                else{
                    le=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    le=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}