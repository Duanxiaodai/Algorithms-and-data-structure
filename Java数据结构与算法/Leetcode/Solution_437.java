import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_437 {
    static int path  = 0;
    public int pathSum(TreeNode root, int sum) {
        List<TreeNode> list =new LinkedList<>();
        list.add(root);
        int result = 0;
        while (!list.isEmpty()){
            TreeNode temp =((LinkedList<TreeNode>) list).remove(0);
            path(temp,sum);
            if (temp!=null){
                list.add(temp.left);
                list.add(temp.right);
            }
        }
        return result;
    }
    public void pathSumCore(TreeNode root ,int sum,int now){
        if (sum==now){
            if (root==null){
                path++;
                return;
            }
            else {
                now=0;
                path++;
                pathSumCore(root.left, sum, now);
                pathSumCore(root.right, sum, now);
            }
        }
        else if (root==null){
            return ;
        }
        else {
            now = root.val+now;
            pathSumCore(root.left,sum,now)
            pathSumCore(root.right,sum,now);
        }
    }
    private void path(TreeNode root, int sum) {
        if (root == null) return;
        if (sum - root.val == 0) path++;
        path(root.left, sum - root.val);
        path(root.right, sum - root.val);
    }

}
class Solution {
    private int cnt;

    public int pathSum(TreeNode root, int sum) {
        cnt = 0;
        find(root, sum);
        return cnt;
    }

    private void find(TreeNode root, int sum) {
        if (root == null) return;
        path(root, sum);
        find(root.left, sum);
        find(root.right, sum);
    }

    private void path(TreeNode root, int sum) {
        if (root == null) return;
        if (sum - root.val == 0) cnt++;
        path(root.left, sum - root.val);
        path(root.right, sum - root.val);
    }
}
