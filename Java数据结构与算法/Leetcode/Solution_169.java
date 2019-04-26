import java.util.*;
public class Solution_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int result = nums[0];
        for (Integer temp: map.keySet()){
            if (map.get(temp)>map.get(result)){
                result = temp;
            }
            System.out.println(result);
        }
        return result;
    }
    public static void main(String a[]){
        System.out.println(majorityElement(new int []{2,3,3}));
    }
}
