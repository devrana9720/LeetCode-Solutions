class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderTraversal(root, ans);
        return ans;
    }

    public void preorderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val);
        preorderTraversal(root.left, ans);
        preorderTraversal(root.right, ans);
    }
}