import java.util.Scanner;
class ArrayTwoD8{
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
	       int sum = 0;
	       for(int i = 0; i<arr.length ; i++){
                
	       sum = sum+arr[1];
        }

	System.out.println("Sum : "+sum);
     }
}
