class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Sulotion_101 {
    public boolean isSymmetric(TreeNode root) {
        return iscore(root,root);
    }
    public boolean iscore(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        else if(root1==null&&root2!=null){
            return  false;
        }
        else if (root1!=null&&root2==null){
            return false;
        }
        else if(root1.val!=root2.val){
            return false;
        }
        else{
            return iscore(root1.left,root2.right)&&iscore(root1.right,root2.left);
        }
    }
}
