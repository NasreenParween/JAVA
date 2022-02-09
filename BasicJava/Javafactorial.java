package factorial1;
import java.io.*;
class factorial1
{
	
	int fact(int n)
	{
		if(n==1)
			return 1;
		else 
			return n* fact(n-1);
	}
	
}

public class Javafactorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader o1=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter the value for computing factorial1");
		n=Integer.parseInt(o1.readLine());
		factorial1 o2;
		o2= new factorial1();
		int x=o2.fact(n);
		System.out.println("the factorial1 is"+x);

	}

}
