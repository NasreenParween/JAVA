import java.io.*;
public class fileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f1=null;
		 FileOutputStream f2=null;
		 int i;
		 
		 for(int i1=0;i1<args.length;i1++)
		 System.out.println("args["+i1+"]"+args[i1]);
		 
		 if(args.length!=2)
		 {
		 System.out.println("File name out mentioned*");
		 return;
		 }
		 try
		 {
		 f1=new FileInputStream(args[0]);
		 f2=new FileOutputStream(args[1]);
		 do
		 {
		 i=f1.read();
		 if(i!=-1)
		 f2.write(i);
		 }while(i!=-1);
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
