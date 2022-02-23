package series;

import java.io.*;
public class Series {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
       int n;
       BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
       double s=0;
       System.out.println("Enter the value of n");
       n= Integer.parseInt(br2.readLine());
       for(int i=1;i<=n;i++)
    	   s=s+1.0/i;
       System.out.println("Series is"+s);
	}
}
