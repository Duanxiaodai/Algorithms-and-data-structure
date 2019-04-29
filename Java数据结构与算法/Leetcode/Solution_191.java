public class Solution_191 {
    public int hammingWeight(int n) {
        int sum = 0;
        while (n!=0){
            sum += n&1;
            n = n>>>1;//无符号 右移一位
        }
        return sum;
    }
}
