package data_structure;

import java.util.*;
import java.math.*;
public class Test {

	public static void main(String[] args) {
		String temp = new String("duansdyuefeng");
		
		
	}	
}

class Circle {
	static int num = 0;
	 double radius = 3;
	// public Circle() {
	// // TODO �Զ����ɵĹ��캯�����
	// }s
	//
	 public Circle(double k) {
	 // TODO �Զ����ɵĹ��캯�����
	 radius = k;
	 num++;
	 getNum();
	 }
	public double getRadius() {
		getNum();
		return radius; 
		
	}
	public static void getNum(){
		System.out.println(num);
	}
	
}
