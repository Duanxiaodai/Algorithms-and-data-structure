import java.util.Set;
import java.util.HashSet;
public class Solution_202 {
    public static boolean isHappy(int n) {
        int temp = n;
        int sum = 0;
        if (n == 1){
            return true;
        }
        Set<Integer> set= new HashSet();
        while(sum !=1){
            sum = 0;
            int end =0;
            while (temp!=0){
                end = temp%10;
                temp = temp/10;
                sum = sum+end*end;
            }
            temp = sum;
            System.out.println(sum);
            if (set.contains(sum)){
                return false;
            }
            set.add(sum);
        }
        return true;
    }

    public static void main(String[] args) {
        isHappy(9);
    }
}
