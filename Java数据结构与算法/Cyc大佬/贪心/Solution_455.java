package 贪心;

import java.util.Arrays;

public class Solution_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
//        int result = 0;
        int i = 0;
        int j = 0;
        while (i<g.length&&j<s.length){
            if(g[i]<=s[j]){
//                result++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return i;
    }
}
