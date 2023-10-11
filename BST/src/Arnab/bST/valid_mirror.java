package Arnab.bST;

public class valid_mirror {
    static class  TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(7);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(9);

        TreeNode root2 = new TreeNode(5); //Mirror Tree
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(1);
        root2.right.right = new TreeNode(2);
        root2.right.left = new TreeNode(7);
        root2.left.right = new TreeNode(0);
        root2.left.left = new TreeNode(9);
        System.out.println (isMirror(root1,root2));
    }

    public static boolean isMirror(TreeNode root1 , TreeNode root2 ){
        if (root1==null || root2==null)
            return root1==root2;
        return ((root1.val)==(root2.val) && isMirror(root1.left,root2.right)
                && isMirror(root1.right, root2.left));
    }
    public static boolean check(TreeNode leftsub , TreeNode rightsub){
        if (leftsub == null && rightsub == null)
            return true;
        if (leftsub == null || rightsub==null && leftsub.val !=rightsub.val)
            return false;
        return check(leftsub.left , rightsub.right) && check(leftsub.right , rightsub.left);
    }

}
