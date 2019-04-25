public class Solution_125 {
    public boolean isPalindrome(String s) {
        if (s.length()==0){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            while (!Character.isLetterOrDigit(s.charAt(i))&&i<j){
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j))&&i<j){
                j--;
            }
            if (Character.isDigit(s.charAt(i))||Character.isDigit(s.charAt(j))){
                if (s.charAt(i)!=s.charAt(j)){
                    return false;
                }
            }
            int temp = s.charAt(i)-s.charAt(j);
            if (temp!=32&&temp!=-32){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
