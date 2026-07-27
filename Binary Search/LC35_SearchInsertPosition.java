class Solution {
    public int searchInsert(int[] nums, int target) {
        int le = 0, right = nums.length - 1;
        while (le <= right) {
            int mid = le + (right - le) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) le = mid + 1;
            else right = mid - 1;
        }
        return le;
    }
}