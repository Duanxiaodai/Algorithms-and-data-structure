import java.util.*;

class Solution {
    public  String longestPalindrome(String s) {
    	int low = 0;
    	int high = 0;
    	int max = 0;
    	for (int i = 0;i<s.length();i++){
    		for (int j = i+max;j<s.length();j++){
    			if (ispalind(s, i, j)){
    				if ((j-i)>=max){
    					low = i;
    					high = j;
    					max = j - i;
    				}
    			}
    		}	
    	}
    	if (s.length()==0){
    		return "";
    	}
    	return s.substring(low,high+1);
    }
    public 	Boolean ispalind(String s , int i , int j){
    	while(i<j){
    		if(s.charAt(i)!=s.charAt(j)){
    			return false;
    		}
    		i++;
    		j--;
    	}
    	return true;
    }
}