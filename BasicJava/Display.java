import java.io.*;
public class Display {

public static void main(String[] args) throws IOException{

         int i,flag=0;
         char ch;
            if(args.length!=1)
                {
                  System.out.println("DisplayFile filename");
                  return;
                }

              try(FileInputStream f1=new FileInputStream(args[0]))
                 {
                   while((i=f1.read())!=-1)
                     {
                     ch=(char)i; //conversion from int to char
                     if(flag==1)
                       System.out.print(ch);
                     if(ch=='/')
                         {
                         ch=(char)f1.read();
                           if(ch=='/')
                           {
                             flag=1;
                           }
                         }
                    if(ch=='\n')
                     flag=0;     
                 }
               }

    }
}