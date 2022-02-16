import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
class noargs extends Exception{
    int l1;
    noargs(int l){
        l1=l;
    }
    public String toString(){
        return("No arguments");
    }

}		
public class Question5 {
	
	static void check(int l)throws noargs {
        if(l != 0 && l!=0)
            throw new noargs(l);
    }

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		if(args.length == 5)
		{
			String s = "";
			FileWriter fileWriter = new FileWriter("C:\\Users\\NASREEN PARWEEN\\eclipse-workspace\\Assignment Questions\\src\\file1.txt.txt");
			for(int i=0;i<args.length;i++) {
				char charArray[] = args[i].toCharArray();
				Arrays.sort(charArray);
				s+= new String(charArray) + "\n";
				
			}
			fileWriter.write(s);
		    fileWriter.close();
		}
		else if(args.length == 0)
		{
			String s = "" ;
			System.out.println("ENTER SENTENCE OF 5 WORDS:");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			char charArray[] = str.toCharArray();
			//System.out.println(charArray);
			//System.out.println(charArray.length);
			for(int j = 0; j < charArray.length ; j++)
			{
				if(charArray[j] != ' ')
				{
					s += charArray[j];
				}
				
				else if(charArray[j] == ' ')
				{
					char sArr[] = s.toCharArray();
					Arrays.sort(sArr);
					System.out.println(sArr);
					s = "";
					
				}
			}
		}
		else
		{
			try
			   {
				   check(args.length);
			   }
			   catch(noargs ar)
			   {
				   System.out.println("Error: Number of arguments is not valid!");
				   System.exit(0);
			   }
		}

	}


}

