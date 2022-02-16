import java.io.*;
class NegativeAge extends Exception
{
	int age;
	NegativeAge(int a)
	{
		age=a;
	}
	public String toString()
	{
		return("Negative Age Exception"+age);
	}
}
class Employee
{
	private String Empid,Designation,CompanyName;
	int Age;
	Employee(String a,String b,String c,int d)throws IOException
	{
		Empid=a;
		Designation=b;
		CompanyName=c;
		Age=d;
		try {
			if(Age<0)
			{
				throw new NegativeAge(d);
			}
			}catch(NegativeAge e)
			{
				System.out.println(e);
			}
			if(Age<0)
			{
				do{
				System.out.println("Enter the age again");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				Age=Integer.parseInt(br.readLine());
				}while(Age<0);
			}
	}
	void display()throws IOException
	{
		System.out.println("Empid= "+Empid+" Designation= "+Designation+" CompanyName= "+CompanyName+" Age= "+Age);
	}
}
public class NegAge  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e1=new Employee("nasreen999786@gmail.com","Software Engineer","WIPRO",25);
		e1.display();
		Employee e2=new Employee("mahikhan143@gmail.com","Veternary","AIMS",-25);
		e2.display();
	}

}
