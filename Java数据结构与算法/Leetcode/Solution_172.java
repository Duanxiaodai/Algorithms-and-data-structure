import java.math.BigInteger;

public class Solution_172 {
    public int trailingZeroes(int n) {

        BigInteger nn=new BigInteger(String.valueOf(1));
        for(int i =1;i<=n;i++){
            nn.multiply(new BigInteger(""+i));
        }
        String temp = nn.toString();
        System.out.println(temp);
        int result=0;
        for(int i =temp.length()-1;i>=0;i--){
            if (temp.charAt(i)=='0')
                result++;
            else {
                return result;
            }
        }
        return result;
    }
    public int trailingZeroes2(int n) {

        int result = 0;
        while (n>=5){
            n/=5;
            result+=n;
        }

        return result;
    }
}
