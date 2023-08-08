	/* input array{{1,9,9},{2,8,3},{4,3,2}};
	 * output:
	 1
	 2
	 4
	 -------
	 9
	 8
	 3
	 --------
	 9
	 3
	 2
	 * */
	package com.array2D;
	
	public class Task1 {
		public static void main(String[] args) {
			int rows=0;
			int cols=0;
			
			int [][]arr= {{1,9,9},{2,8,3},{4,3,2}};
			for(int i=0;i<arr.length;i++) {
				int min=arr[i][0];
				for(int j=0;j<arr.length;j++) {
					if(arr[i][j]<min) {
						min=arr[i][j];
					}
				}
			System.out.println("Minimum values: " + min);
			System.out.println("--------");
			}
		}
	}