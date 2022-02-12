import java.util.Scanner;
//LINEAR SEARCH USING SWITCH...
class search
{
	int a[],n;
	void getinput()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the number in array");
		for( int i=0; i<n; i++)
			a[i]=sc.nextInt();	
	}
	void search(int x)
	{
		int i;
		for(i=0; i<n; i++)
		{
			if(a[i]==x)
			{
				System.out.println("Element found at position"+(i+1));
				break;
			}
		}
		if(i==n)
		System.out.println("element not found");
	}
}
public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     search o1= new search();
     int ch1,x;
     String ch="y";
     while(ch.equals("y"))
     {
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("1. INPUT");
    	 System.out.println("2. ELEMENT SEARCH");
    	 System.out.println("3. ENTER THE CHOICE");
    	 ch1=sc.nextInt();
    	 switch(ch1)
    	 {
    	 case 1: o1.getinput();
    	        break;
    	 case 2: System.out.println("Enter the number you want to search");
    	         x= sc.nextInt();
    	         o1.search(x);
    	         break;
    	   } 
    	 System.out.println("...DO YOU WANT TO CONTINUE...");
    	 ch=sc.next();
     }
    	 
	}

}
