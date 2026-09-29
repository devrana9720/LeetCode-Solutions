class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorderTraversal(root, ans);
        return ans;
    }

    public void preorderTraversal(TreeNode root, List<Integer> answ) {
        if (root == null) {
            return;
        }

        answ.add(root.val);
        preorderTraversal(root.left, answ);
        preorderTraversal(root.right, answ);
    }
}