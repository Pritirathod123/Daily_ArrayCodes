import java.util.Scanner;
class ArrayTwoD7{
        public static void main (String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size ");
                int size = sc.nextInt();
                int arr[] = new int[size];

                for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element: ");
                        arr[i] = sc.nextInt();
		}
			System.out.println("Array Element are : ");
		
        
                for(int i = 0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }
}
