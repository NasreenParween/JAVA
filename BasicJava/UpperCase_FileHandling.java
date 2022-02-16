import java.io.*;
public class UpperCase {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=2){
            System.out.println("file cannot be named");
        }
        try{
     fin=new FileInputStream(args[0]);
    }
    catch(FileNotFoundException e){
        System.out.println("unable to open");
    }

    try{
        fout=new FileOutputStream(args[1]);
       }
       catch(FileNotFoundException e){
           System.out.println("unable to open");
       }

       int x;
       char ch1,ch2;
       try
       {
       do{
       ch1=(char)fin.read();
       if(ch1!=-1){
       do{
       ch2=(char)fin.read();
       if(ch1>='A' && ch1<='Z'){
           fout.write(ch2);
       }
       }
       
       while(ch2!='\n');
       System.out.println("File copied"); 
    }
   }     
       while(ch1!=-1);   
   }
       catch(IOException o1)
       {
    	   System.out.println(o1); 
       }
	}
}


