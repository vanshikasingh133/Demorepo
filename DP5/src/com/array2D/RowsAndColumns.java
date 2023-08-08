package com.array2D;

public class RowsAndColumns {
		public static void find2dmax(int [][]arr1)
		{
		
			int len = arr1.length;
			System.out.println("Maximun number in columns are : ");
			for(int i = 0; i < len; i++)
			{
				int maxcol = arr1[0][i];
				for(int j = 0; j < arr1[i].length; j++)
				{
					if(arr1[j][i] > maxcol)
					maxcol = arr1[j][i];
						
				}
				System.out.println(maxcol);
				
			}
		}
		
		public static void main(String[] args) {
			int arr[][] = {{22, 31, 9}, {12, 25, 16},{34,42,2}};

			find2dmax(arr);

		}

	}