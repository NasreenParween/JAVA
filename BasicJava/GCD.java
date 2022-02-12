package gcd;

import java.io.*;
public class GCD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     int x,y,rem;
     BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the value of x");
     x= Integer.parseInt(br1.readLine());
     System.out.println("Enter the value of y");
     y= Integer.parseInt(br1.readLine());
     rem=x%y;
     while(rem!=0)
     {
    	 x=y;
    	 y=rem;
    	 rem=x%y;
     }
     if(rem==0)
    	 System.out.println("GCD is"+y);
    	 
	}

}