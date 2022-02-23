import java.util.Scanner;
class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		width=0;
		height=0;
		depth=0;
	}
    Box(double w, double h, double d)
    {
    	width=w;
    	height=h;
    	depth=d;
    }
    void getinput()
    {
    	Scanner sc=new Scanner(System.in);
    	width=sc.nextInt();
    	height=sc.nextInt();
    	depth=sc.nextInt();	
    }
    Box (double len)
    {
    	width=height=depth=len;
    }
   void volume()
    {
    	System.out.println(width*height*depth);
    }
  
}
public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box b1= new Box();
     Box b2= new Box();
     Box b3 = new Box(7);
     int ch1;
     String ch="y";
     while(ch.equals("y"))
     {
    	 System.out.println("1. INPUT");
    	 System.out.println("2. BOX VOLUME");
    	 System.out.println("ENTER THE CHOICE");
    	 Scanner sc= new Scanner(System.in);
    	 ch1=sc.nextInt();
    	 switch(ch1)
    	 {
    	 case 1: System.out.println("1.ENTER THE VALUE FOR DEFAULT PARAMETER:");
    		     b1.getinput();
    		     System.out.println("1.ENTER THE VALUE FOR PARAMETRISE PARAMETER :");
    	         b2.getinput();
    	         break;
    	 case 2: System.out.println("1.VOLUME OF DEFAULT:");
    		     b1.volume();
    		     System.out.println("1.VOLUME OF PARAMETRISE :");
    	         b2.volume();
    	         System.out.println("1.VOLUME OF CUBE IS :");
    	         b3.volume();
    	         break;
    	 }
    	 System.out.println("...DO YOU WANT TO CONTINUE...");
    	 ch=sc.next(); 
     }
  }
}
