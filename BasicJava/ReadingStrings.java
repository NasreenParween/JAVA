import java.io.*;
public class ReadingStrings {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter any string : ");
	        String str = br.readLine();
	        char str1 = (char)br.read();

	        System.out.println("You have entered : "+str);
	        System.out.println("You have entered : "+str1);
	    }
	}

