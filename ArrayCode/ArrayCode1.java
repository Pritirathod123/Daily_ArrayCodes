import java.io.*;
class InputDemo1{
	public static void main (String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		System.out.println("Enter wing");
		String wing = br.readLine();
		System.out.println("Enter flatNo");
		String flatNo = br.readLine();
	}
}


