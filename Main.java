
public class Main extends Solution {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(7);
        System.out.println(deepestLeavesSum(root));
    }
}




