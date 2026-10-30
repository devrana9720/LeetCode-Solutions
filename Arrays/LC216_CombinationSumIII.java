class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int k, int remain, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k && remain == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (path.size() == k || remain < 0) return;
        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtrack(i + 1, k, remain - i, path, ans);
            path.remove(path.size() - 1);
        }
    }
}