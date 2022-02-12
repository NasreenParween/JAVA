import java.util.Scanner;
class functions
{
	private int num, denom;
	functions()
	{
		num=0;
		denom=0;
	}
	functions(int x, int y)
	{
		num=x;
		denom=y;
	}
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF NUMERATOR AND DENOMINATOR");
		num=sc.nextInt();
		denom=sc.nextInt();	
	}
	void display()
	{
		System.out.println("FRACTION :");
		System.out.println(num+"/"+denom);
	}
	functions addition(functions o1)
	{
		functions o2=new functions();
		o2.num=(num*o1.denom)+(o1.num*denom);
		o2.denom=o1.denom*denom;
		return o2;
	}
	functions subtraction(functions o1)
	{
		functions o2=new functions();
		o2.num=(num*o1.denom)-(o1.num*denom);
		o2.denom=o1.denom*denom;
		return o2;
	}
	functions multiply(functions o1)
	{
		functions o2=new functions();
		o2.num=(num*o1.num);
		o2.denom=o1.denom*denom;
		return o2;
	}
	functions preincrement()
	{
		num=num+denom;
		denom=denom;
		return(this);
	}
	functions postincrement()
	{
		functions o1= new functions();
		o1.num=num;
		o1.denom=denom;
		num=num+denom;
		denom=denom;
		return(o1);
	}	
}
public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    functions o1= new functions();
    functions o2= new functions();
    functions o3= new functions();
    int ch1;
    String ch="y";
    while(ch.equals("y"))
    {
    	System.out.println("1. INPUT");
    	System.out.println("2. ADDITION");
    	System.out.println("3. SUBTRACTION");
    	System.out.println("4. MULTIPLICATION");
    	System.out.println("5. PRE-INCREMENT ");
    	System.out.println("6. POST-INCREMENT");
    	System.out.println("7. DISPLAY");
    	System.out.println("ENTER THE CHOICE");
    	Scanner sc= new Scanner(System.in);
    	ch1=sc.nextInt();
    	switch(ch1)
    	{
    	case 1: o1.getinput();
    	        o2.getinput();
    	        o3.getinput();
    	        break;
    	case 2: o2=o1.addition(o3);
    	        break;
    	case 3: o2=o1.subtraction(o3);
    	        break;
    	case 4: o2=o1.multiply(o3);
    	        break;
    	case 5: o2=o1.preincrement();
    	        break;
    	case 6: o2=o1.postincrement();
    	        break;
    	case 7: o1.display();
    	       o2.display();
    	       o3.display();
    	       break;    
    	}
    	System.out.println("DO YOU WANT TO CONTINUE");
    	ch=sc.next();
    }
  }
}
