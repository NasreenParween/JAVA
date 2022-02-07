import java.io.*;
class functions
{
	int a[],n;
	void getinput() throws IOException
	{
     BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the size of an array");
     n=Integer.parseInt(br1.readLine());
     a= new int[n];
     System.out.println("Enter the element in array");
     for(int i=0; i<n; i++)
     a[i]=Integer.parseInt(br1.readLine()); 
	}
	void search(int x)
	{
		int low=0;
		int high=n-1;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==x)
			{
			System.out.println("Element found at position: "+(mid+1));
			break;
			}
			else if(a[mid]>x)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(low>high)
	   System.out.println("Element not found at position: ");	
	}
}

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		functions o1=new functions();
		int ch1,x;
		char ch='y';
		while(ch=='y')
		{
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("1. INPUT");	
			 System.out.println("2. SEARCH");	
			 System.out.println("ENTER THE CHOICE");	
			 ch1=Integer.parseInt(br1.readLine());
			 switch(ch1)
			 {
			 case 1: o1.getinput();
			        break;
			 case 2:  System.out.println("Enter the number you want to search");	
			         x=Integer.parseInt(br1.readLine());
			         o1.search(x);
			         break; 
			 }
			 System.out.println("Do you want to continue");	
			 ch=(char)br1.read();
		}

	}

}
