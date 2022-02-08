package elementSearch;
import java.io.*;
public class Search {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader o2=new BufferedReader(new InputStreamReader(System.in));
		int a[];
		int n;
		System.out.println("Enter the size of an array");
		n= Integer.parseInt(o2.readLine());
		a= new int [n];
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++)
		  a[i]=Integer.parseInt(o2.readLine());
		System.out.println("Enter the element to search");
		int x=Integer.parseInt(o2.readLine());
		int i;
		for(i=0; i<n; i++)
			if(a[i]==x)
			{
				System.out.println("Element found"+(i+1));
				break;
			}
		if(i==n)
			System.out.println("Element not found");
	}

}
