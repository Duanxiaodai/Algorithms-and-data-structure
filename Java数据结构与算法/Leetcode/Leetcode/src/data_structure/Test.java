package data_structure;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// TODO 自动生成的方法存根
		int[] mylist = { 1 };
		// for (int temp1 = 0;temp1<mylist.length;temp1++){
		// System.out.print(mylist[temp1]);
		// }
		int[] temp0 = new int[] { 2, 1, 3 };
		char[] temp1 = { 'd', 'y', 'f' };
		char[] temp2 = new char[3];
		// System.arraycopy(temp1, 0, temp2, 0, 3);
		// reverse(temp0);
		Arrays.sort(temp0);
		// System.out.println(Arrays.toString(temp0));
		int [][] matrix = new int[4][4];
		for (int i = 0;i<matrix.length;i++){
			for (int j = 0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		for (int c[] : matrix) {
			for (int i : c){
				System.out.print(i+" ");	
			}
			System.out.println();
		}
	}

	public static void add1array(int array[]) {
		for (int i = 0; i < array.length; i++)
			array[i] += 1;
	}

	public static int[] reverse(int array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
}
