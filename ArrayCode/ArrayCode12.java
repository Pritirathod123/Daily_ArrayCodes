import java.util.*;
class InputDemo12{

        public static void main (String [] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Player info");
                String info = sc.nextLine();

                StringTokenizer st = new StringTokenizer(info, " @# ");
                while(st.hasMoreTokens()){
                        System.out.println(st.nextToken());
                }
        }
}

