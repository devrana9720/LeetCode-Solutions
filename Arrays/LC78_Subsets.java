class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), answer);
        return answer;
    }
    private void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> answer) {
        answer.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr, answer);
            curr.remove(curr.size() - 1);
        }
    }
}