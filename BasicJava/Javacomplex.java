package complexnumber;
import java.io.*;

class complexnumber
{
	private int real, img;
	public complexnumber()
	{
		real=0;
		img=0;
	}
	complexnumber(int i,int j)
	{
		real=i;
		img=j;
	}
	complexnumber(complexnumber o3)
	{
		real=o3.real;
		img=o3.img;
	}
	void input(int p,int q)
	{
		this.real=p;
		this.img=q;
	}
	void display()
	{
		System.out.println(real+"+i"+img);
	}
	complexnumber add(complexnumber o1)
	{
		complexnumber temp= new complexnumber() ;
		temp.real=this.real+o1.real;
		temp.img=this.img+o1.img;
		return temp;
	}
	public String toString()
	{
		return (real+"+i"+img);
	}
}

public class Javacomplex {

	public static void main(String[] args)   throws IOException {
		// TODO Auto-generated method stub
		 complexnumber o1,o2;
	       int x,y;
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       o1= new complexnumber();
	       System.out.println("Enter the real and imaginary part of complex number");
		   x=Integer.parseInt(br.readLine()); 
		   y=Integer.parseInt(br.readLine());
		   o1.input(x, y);
		   o1.display();
		   o2= new complexnumber(45,67);
		   o2.display();
		   complexnumber o3;
		   o3= new complexnumber();
		   o3= o1.add(o2);
		   System.out.println("Sum of two complex numbers are");
		   o3.display();
		   complexnumber o5= new complexnumber(o3);
		   System.out.println("Copy constructor");
		   o5.display();
		  /// System.out.println(o5.toString());
		   System.out.println("tostring function");
		   System.out.println(o5);
		   

	}

}
