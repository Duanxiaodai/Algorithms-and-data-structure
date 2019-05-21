public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int sum = 0;
        for (int i = 0;i<nums.length;){
            while (i<nums.length&&nums[i]==0){
                sum++;
                i++;
            }
            for (  ; i <nums.length ; i++) {
                if (nums[i]!=0){
                    nums[i-sum]=nums[i];
                }
                else{
                    break;
                }
            }
        }
        for (int i = 0; i <sum; i++) {
            nums[nums.length-i-1]=0;
        }
    }
}
