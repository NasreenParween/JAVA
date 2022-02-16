import java.io.*;
public class newProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f1=null;
		FileOutputStream f2=null;
		int a,a1;
		char ch;
		if(args.length!=2)
		{
			System.out.println("Error in file Opening!!!");
			return;
		}
		try 
		{
			f1=new FileInputStream(args[0]);
			f2=new FileOutputStream(args[1]);
			do
			{
				a=f1.read();
				if(a!=-1)
				{
					ch=(char)a;
					do
					{
						a1=f1.read();
						if(Character.isUpperCase(ch))
						{
								f2.write(a);
						}
					}	while(((char)a1)!='\n');
				}
			}while(a!=-1);
		}
		catch(FileNotFoundException o1)
		{
			System.out.println(o1);
		}
		catch(IOException o1)
		{
			System.out.println(o1);
		}
	}

}
