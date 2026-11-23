package com.arrays;

public class Practice {
	public static void main(String[] args) {
		
		int[][] arr = new int [2][2];
		
		arr [0][0] = 10;
		arr [0][1] = 20;
		arr [1][0] = 30;
		arr [1][1] = 40;
		
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = 0; j < arr.length; j++) {
//				
//				System.out.print(arr [i][j] + " ");
//			}
//		}
		
		int[][] arr2 = {{11, 22}, {33, 44}};
		
//		for (int[] aor : arr2) {		// enhanced for loop
//			System.out.println(Arrays.toString(aor));
//		}
		
		for (int[] ar : arr2) {
			for(int x : ar) {
				System.out.println(x);
			}
		}
	}
}
