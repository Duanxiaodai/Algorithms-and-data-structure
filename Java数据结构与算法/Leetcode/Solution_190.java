import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sulotion_190 {
    public int reverseBits(int n) {

//        int temp = 0;
//        for (int i = 0;i<32;i++){
//            temp = temp|(n&1);
//            temp = temp<<1;
//            n = n>>1;
//        }
//        return temp;

        return Integer.reverse(n);

    }
    public static void main(String[]agrs){
        System.out.println(Integer.reverseBytes(0x80000000));
    }
}
