

class Solution_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return iscore(nums,0,nums.length-1);
    }
    public TreeNode iscore(int [] nums,int begin,int end){
        if (begin==end){
            return new TreeNode(nums[begin]);
        }
        else{
            TreeNode root = new TreeNode(nums[(begin+end)/2]);
            if ((begin+end)/2-1>=begin){
                root.left = iscore(nums,begin,(begin+end)/2-1);
            }
            if((begin+end)/2+1<=end){
                root.right = iscore(nums,(begin+end)/2+1,end);
            }
            return root;
        }
    }
}
