import java.io.*;
class InputDemo3{
        public static void main (String [] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter your name");
                String name = br.readLine();

                System.out.println(" Enter society name");
                String socName = br.readLine();

                System.out.println("Enter wing");
                char wing = (char)br.read();
		br.skip(1);

                System.out.println("Enter flatNo");
                String flatNo = br.readLine();


                System.out.println("Name : " +name);
                System.out.println("Name : "+socName);
                System.out.println("wing : "+wing);
                System.out.println("flatNo : " +flatNo);
        }


}


