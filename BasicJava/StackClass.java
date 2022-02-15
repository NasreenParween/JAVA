import java.io.*;
class stackexcp extends Exception
{
String str;
stackexcp(String a)
{
str=a;
}
public String toString()
{
  return "stack" +str;
}
}
class stack
{
int a[],size;
int tos;
stack(int k)
{
size=k;
a=new int[size];
tos=-1;
}
void push(int x)
{
try
{
if(tos==size-1) {
	throw new stackexcp("overflow");
	}
	else
	a[++tos]=x;
	}
	catch(stackexcp o1)
	{
	System.out.println(o1);
	}
	}
	void pop()
	{
	try
	{
	if(tos==-1) {
	throw new stackexcp("Underflow");
	}
	else
	System.out.println(a[tos--]);
	}
	catch(stackexcp o1)
	{
	System.out.println(o1);
	}
	}
	void display() 
	{
	for(int i=tos;i>=0;i--)
	System.out.println(a[i]);
	}
	
}
public class StackClass {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		stack o1=new stack(4);
		int x;
		String ch1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("1.Push operation:");
		System.out.println("2.Pop operation:");
		System.out.println("3.Display operation:");
		System.out.println("Enter your choice:");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1: System.out.println("Enter the value to push");
		        x=Integer.parseInt(br.readLine());
		        o1.push(x);
		         break;
		case 2: for(int i=1;i<=6;i++)
		       o1.pop();
		       break;
		case 3: o1.display();
		}
		System.out.println("Do you want to continue");
		ch1=br.readLine();
		}while(ch1.equals("y"));
		}
	}


