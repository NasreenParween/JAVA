package complex;
import java.util.Scanner;
class complex
{
	private int x,y;
	public complex()
	{
		x=0;
		y=0;
	}
	complex(int i, int j)
	{
       x=i;
	   y=j;
	}
	complex(complex c)
	{
		x=c.x;
		y=c.y;
	}
	void getinput()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the real part of complex number");
		x= sc.nextInt();
		System.out.println("enter the imaginary part of complex number");
		y=sc.nextInt();
	}
	complex addcomplexnumber(complex c)
	{
		complex c2= new complex();
		c2.x=x+c.x;
		c2.y=y+c.y;
		return c2;
	}
	complex multiplycomplexnumber(complex c)
	{
		complex c2= new complex();
		c2.x=(x*c.x)+(y*c.y);
		c2.y=(x*c.x)-(y*c.y);
		return c2;	
	}
	public String tostring()
	{
		return (x+"+i"+y);
	}
	void display()
	{
		System.out.println(x+"+i"+y);	
	}	
}

public class Complexnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex o1=new complex();
		complex o2=new complex();
		complex o3=new complex();
	 String ch="y";
	  int ch1;
	  while(ch.equals("y"))
	  {
		  System.out.println("1. Input");
		  System.out.println("2. Addition");
		  System.out.println("3. Multiplication");
		  System.out.println("4. Display");
		  System.out.println("1. Enter the choice");
		  Scanner sc= new Scanner(System.in);
		  ch1= sc.nextInt();
		  switch(ch1)
		  {
		  case 1: o1.getinput();
		          o2.getinput();
		          break;
		  case 2: o3= o1.addcomplexnumber(o2);
		           System.out.println("sum of two complex number uing tostring function is"+o3.tostring());
		           break;
		  case 3: o3=o1.multiplycomplexnumber(o2);
		        System.out.println("multiply of two complex number using tostring function is" +o3.tostring());
		        break;
		  case 4: o1.display();
		         o2.display();
		         o3.display();
		         break;
		  }
		  System.out.println("1.Do you want to continue");
		  ch=sc.next();   
		  }
		  
	  }
	}
