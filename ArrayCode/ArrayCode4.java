import java.util.*;
class InputDemo4{
        public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name");
                String name = sc.next();

                System.out.println(" Enter society name");
                String socName = sc.next();

                System.out.println("Enter wing");
                char wing = sc.next().charAt(0);

                System.out.println("Enter flatNo");
                int flatNo = sc.nextInt();


                System.out.println("Name : " +name);
                System.out.println("Name : "+socName);
                System.out.println("wing : "+wing);
                System.out.println("flatNo : " +flatNo);
        }


}

