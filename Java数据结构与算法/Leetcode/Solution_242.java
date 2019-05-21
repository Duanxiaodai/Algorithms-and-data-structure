import java.util.Arrays;
import java.util.HashMap;

public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map = new HashMap();
        if (s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i <t.length() ; i++) {
            if (!map.containsKey(t.charAt(i))){
                return false;
            }
            else {
                if (map.get(t.charAt(i))>0){
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isAnagram2(String s, String t) {
        int [] map= new int[26];
        if (s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for (int i = 0; i <26 ; i++) {
            if (map[i]!=0){
                return false;
            }
        }
        return true;
    }
}
