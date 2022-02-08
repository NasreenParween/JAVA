package duplicate;
import java.io.*;

public class Javaduplicate {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		BufferedReader o1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int n;
		n=Integer.parseInt(o1.readLine());
		int a[];
		a=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++)
        	a[i]=Integer.parseInt(o1.readLine());
        // 1 2 2 3 3   1 2 3   1 2 3 2      1 2 3
        // 1 2 3 3
        // 1 2 3
        for(int i=0;i<n-1;i++)
        	for(int j=i+1;j<n;j++)
        		if(a[i]==a[j])
        		{
        			if(j==n-1)
        				n=n-1;
        			else
        			{
        				for(int k=j;k<n-1;k++)
        					a[k]=a[k+1];
        				n=n-1;
        			}
        			
        		}
        System.out.println("Elements after removing duplicates");
        for(int i=0;i<n;i++)
        	System.out.println(a[i]);

	}

}
