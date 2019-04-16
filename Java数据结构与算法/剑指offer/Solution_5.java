public class Solution_5 {
    public String replaceSpace(StringBuffer str) {
        String temp = new String(str);
        return temp.replaceAll(" ","%20");
    }
}