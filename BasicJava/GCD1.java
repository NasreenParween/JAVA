
import java.util.Scanner;
public class GCD1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int x,y;
	 String ch="y";
		while(ch.equals("y"))
		{
			Scanner scn= new Scanner(System.in);
			System.out.println("Enter the value of x");
			x= scn.nextInt();
			System.out.println("Enter the value of y");
			y= scn.nextInt();
			int rem;
			rem= x%y;
			while(x%y!=0)
			{
				x=y;
				y=rem;
				rem=x%y;
			}
			if(rem==0)
				System.out.println("GCD IS " +y);
			System.out.println("Do you want to continue ");
			ch=scn.next();
		}
	}

}
