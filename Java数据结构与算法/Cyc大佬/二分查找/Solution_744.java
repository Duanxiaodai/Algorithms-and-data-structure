package 二分查找;

public class Solution_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length-1]<=target){
            return letters[0];
        }
        int i = 0;
        int j = letters.length-1;
        while (i<j){
            int mid = (i+j)/2;
            if (letters[mid]>target){
                j = mid;
            }
            else {
                i = mid + 1;
            }
        }
        return letters[j];
    }
}
