import java.io.*;
public class FileContentDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FileInputStream f1= null;
  int i1, i;
  char ch, ch1, ch2;
  if(args.length!=1)
  {
	  System.out.println("File name not mentioned");
	  return;
  }
  try
  {
	  f1=new FileInputStream(args [0]);
	  do
	  {
		  i=f1.read();
		  if(i!=-1) {
			  i1=f1.read();
			  ch=(char) i;
			  ch1=(char)i1;
			  do
			  {
				  ch2=(char)f1.read();
				  if(ch=='/'&&ch1=='/')
				  System.out.println(ch2);
			  } while(ch2!='\n'); 
		  }
		  }while(i!=-1);
  }
  catch(FileNotFoundException o1)
  {
	  System.out.println(o1);
  }
  catch(IOException o1) {
	  System.out.println(o1);
  }
  
	}

}
