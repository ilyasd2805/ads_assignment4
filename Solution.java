import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Integer> sums = new ArrayList<>();
    public static int deepestLeavesSum(TreeNode root) {
        DepthFS(root, 0);
        return sums.get(sums.size()-1);
    }
    public static void DepthFS(TreeNode node, int size) {
        if (size == sums.size()) sums.add(node.val);
        else sums.set(size, sums.get(size) + node.val);
        if (node.left != null) DepthFS(node.left, size+1);
        if (node.right != null) DepthFS(node.right, size+1);
    }
}