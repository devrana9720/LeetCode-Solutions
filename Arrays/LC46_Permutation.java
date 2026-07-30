class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(num, new boolean[num.length], new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] num, boolean[] used, List<Integer> way, List<List<Integer>> ans) {
        if (way.size() == num.length) {
            ans.add(new ArrayList<>(way));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            way.add(num[i]);
            dfs(num, used, way, ans);
            way.remove(way.size() - 1);
            used[i] = false;
        }
    }
}