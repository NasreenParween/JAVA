package series1;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;
public class Series1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader o2= new BufferedReader (new InputStreamReader(System.in));
		double s=0;
		int n;
		System.out.println("Enter the value of n");
		n= Integer.parseInt(o2.readLine());
		for(int i=1; i<=n; i++)
		s=s+1.0/i;
		System.out.println("Sum of series is"+s);
		String ch="y";
		System.out.println("Enter the choice");
		ch= o2.readLine();
		while (ch.equals("y"))
		{
		System.out.println("Character="+ch);
		ch= o2.readLine();
      }
	 System.out.println("End");

}
}
