class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorder(Node root) {

        if (root == null) {
            return ans;
        }

        for (Node child : root.children) {
            postorder(child);
        }

        ans.add(root.val);

        return ans;
    }
}