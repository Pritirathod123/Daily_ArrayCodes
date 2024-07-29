import java.util.*;
class ArrayTwoD19{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows and columns size:");
		            int row = sc.nextInt();
		            int col = sc.nextInt();

                           int arr[][] = new int [row][col];
                          for(int i = 0; i<arr.length;i++){
				  for(int j = 0; j<arr[i].length;j++){
					  arr[i][j] = sc.nextInt();
					  System.out.print(arr[i][j]+ " ");
				  }
			  }
			  System.out.println();
	}
}
