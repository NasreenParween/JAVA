import java.io.*;
class UnderAge extends Exception
{ 
	int age;
	UnderAge(int p)
	{
		age=p;
	}
	public String toString()
	{
		return"UnderAge"+age;
	}
}
public class ExceptionUnderAge {
	static void test(int x) throws UnderAge
	{
		if(x<18)
			throw new UnderAge(x);
		System.out.println("Age is :" +x);
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
       String ch="y";
       do
         {
    	   System.out.println("ENTER THE AGE");
    	   int x=Integer.parseInt(br1.readLine());
    	   try
    	   {
    		   test(x);
    	   }
    	   catch(Exception o1)
    	   {
    		 System.out.println(o1);  
    	   }
    	   System.out.println("DO YOU WANT TO CONTINIUE");	
    	   ch =br1.readLine();
    }
       while(ch.equals("y"));
       System.out.println("END OF UNDERAGE");
	}

}
