class Solution11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
        	int high = Math.min(height[i],height[j]);
        	int width = j - i;
        	if (high*width>max){
        		max = high*width;
        	}
        	if (height[i]<height[j]){
        		i++;
        	}
        	else{
        		j--;
        	}
        }
        return max;
    }
}