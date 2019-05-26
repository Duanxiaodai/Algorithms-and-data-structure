package 动态规划;

import java.util.Arrays;

class Solution_198 {
    public int rob(int[] nums) {
        int []temp = new int[nums.length];
        if(nums.length<1){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length<=2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        temp[0]=nums[0];
        temp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i = 2;i<nums.length ;i++ ){
            temp[i] = Math.max(temp[i-1],temp[i-2]+nums[i]);
        }
        return temp[nums.length-1];
    }
}