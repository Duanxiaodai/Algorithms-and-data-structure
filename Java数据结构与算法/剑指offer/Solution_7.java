import java.util.*;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
        例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/
public class Solution_7 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0){
            return null;
        }
        else{
            Integer[] prelist = new Integer[pre.length];
            Integer[] inlist = new Integer[pre.length];

            for(int i = 0;i<pre.length;i++){
                prelist[i] = pre[i];
                inlist[i] = in[i];
            }
            return core(Arrays.<Integer>asList(prelist),Arrays.<Integer>asList(inlist));
        }
    }
    public TreeNode core(List<Integer> prelist,List<Integer> inlist){
        if (prelist.isEmpty()){
            return null;
        }
        else{
            TreeNode root = new TreeNode(prelist.get(0));
            int temp = inlist.indexOf(prelist.get(0));
            root.left = core(prelist.subList(1, temp + 1), inlist.subList(0, temp));
            root.right =core(prelist.subList(temp + 1,prelist.size() ), inlist.subList(temp+1, inlist.size()));
            return root;
        }
    }
    public static void main(String []args){
        System.out.println();
    }
}