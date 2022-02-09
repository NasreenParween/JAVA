import java.io.*;

class fract
{
	 int n,d;
 
	public fract()
	{
		n=0;
		d=0;
	}
	fract(int i,int j)
	{
		n=i;
		d=j;
	}
	fract(fract o1)
	{
		n=o1.n;
		d=o1.d;
	}
	void store(int i,int j)
	{
		n=i;
		d=j;
	}
	void display()
	{
		System.out.println(n+"/"+d);
	}
	public String toString()
	{
		return(n+"/"+ d);
	}
	
}
public class Fraction {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int x,y;
		fract o1,o2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("parameterless constructor +o1");
		 o1=new fract();
		o1.display();
		System.out.println("enter the numerator and denomerator");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		o2=new fract(x,y);
		o2.display();
		fract o3;
		System.out.println("parameter constructor +o3");
		o3=new fract(6,88);
		o3.display();
		fract o5=new fract(o3);
		System.out.println("copy constructor +o5");
		o5.display();
		System.out.println("tostring function");
		System.out.println(o5.toString());
       
	}

}