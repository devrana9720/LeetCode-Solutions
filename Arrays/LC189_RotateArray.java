class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] arr2 = new int[n];
        int idx = 0;
        for (int i = n - k; i < n; i++) {
            arr2[idx] = nums[i];
            idx++;
        }
        for (int i = 0; i < n - k; i++) {
            arr2[idx] = nums[i];
            idx++;
        }
        for (int i = 0;i<n;i++) {
            nums[i]= arr[2];
        }
    }
}