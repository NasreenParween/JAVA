import java.io.*;
public class ReadingCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any character : ");
        int ich = br.read();
        System.out.println(ich);
        char ch = (char)ich; //Integer value returned by read() is being type casted using (char)

        System.out.print("You have entered : "+ch);
	}

}
