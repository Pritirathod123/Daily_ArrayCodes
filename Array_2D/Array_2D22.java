import java.io.*;
class ArrayTwoD22{
	public static void main(String [] args)throws IOException{
      		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter  number of rows: ");
		int rows = Integer.parseInt(reader.readLine());

		System.out.print("Enter number of columns:");
		int columns = Integer.parseInt(reader.readLine());

		int[][] arr1 = new int[rows][columns];
		System.out.println("Enter the elements of the arr1:");
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<columns;j++){
	                //  System.out.print(arr1[i][j] + " ");	
			arr1[i][j] = Integer.parseInt(reader.readLine());
			}

		}
		System.out.println(" The 2D array you entered:"); 
		for(int i = 0; i<rows;i++){
			for(int j = 0; j<columns; j++){
				System.out.print(arr1[i][j] + " ");
			}
		System.out.println();
	}
}
}

		

