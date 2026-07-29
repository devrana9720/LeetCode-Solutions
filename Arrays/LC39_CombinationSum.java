class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); 
        dfs(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    
    private void dfs(int[] candidates, int start, int remain,
                     List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (remain < 0) {
            return; 
        }
        
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) {
                break; 
            }
            current.add(candidates[i]);
            dfs(candidates, i, remain - candidates[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}