package 二分查找;

public class Solution_69 {
    public int mySqrt(int x) {//超时  不行
        int i = 0;
        int j = x;
        int mid = (i+j)/2;
        while (i<j){
            if (mid*mid==x){
                return mid;
            }
            else if (mid*mid<x){
                i = mid;
                mid = (i+j)/2;
            }
            else{
                j = mid;
                mid = (i+j)/2;
            }
        }
        if((mid+1)*(mid+1)==x){
            return mid+1;
        }
        return mid;
    }
    public int mySqrt2(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }
}
