import java.util.Scanner;
class functions
{
	private int row,col;
	private int a[][]=new int[6][6];
	public void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ROW MATRIX");
		row=sc.nextInt();
		System.out.println("ENTER THE COLUMN MATRIX");
		col=sc.nextInt();
		System.out.println("ENTER THE ELEMENTS IN MATRIX");
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<col; j++)
			{
				a[i][j]=sc.nextInt();	
			}
		}	
	}
	void display()
	{
		for( int i=0; i<row; i++)
		{
			for( int j=0; j<row; j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	functions add(functions o1)
	{
		functions o2=new functions();
		if(row==o1.row&&col==o1.col)
		{
			o2.row=row;
			o2.col=col;
			for( int i=0; i<row; i++)
			{
				for( int j=0; j<row; j++)
					o2.a[i][j]=a[i][j]+o1.a[i][j];	
			}
		}
		else
			System.out.println("ADDITION IS NOT POSSIBLE");
			return o2;	
	}
	functions multiply(functions o3)
	{
		functions o4= new functions();
		if(col==o3.row)
		{
			o4.row=row;
			o4.col=o3.col;
			for( int i=0; i<o4.row; i++)
			{
				for( int j=0; j<o4.col; j++)
				{
					o4.a[i][j]=0;
					{
						for( int k=0; k<col; k++)
						{
							o4.a[i][j]=o4.a[i][j]+(a[i][k]*o3.a[k][j]);
						}
					}
				}
			}
		}
		else
			System.out.println("MULTIPLICATION IS NOT POSSIBLE");
			return o4;
	}
}
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ch1;
       functions f=new functions();
       functions o1=new functions();
       functions o2=new functions();
       String ch="y";
       while(ch.equals("y"))
       {
    	   System.out.println("1. INPUT");
    	   System.out.println("2. ADDITION");
    	   System.out.println("3. MULTIPLICATION");
    	   System.out.println("4. DISPLAY");
    	   System.out.println("ENTER THE CHOICE");
    	   Scanner sc=new Scanner(System.in);
    	   ch1=sc.nextInt();
    	   switch(ch1)
    	   {
    	   case 1: f.getinput();
    	           o1.getinput();
    	           break;
    	   case 2: System.out.println(" ADDITION OF MATRIX IS :");
    		      o2=f.add(o1);
    	          break;
    	   case 3: System.out.println(" MULTIPLICTAION OF MATRIX IS :");
    		       o2=f.multiply(o1);
    	           break;
    	   case 4: System.out.println(" DISPLAY 1st MATRIX");
    	           f.display();
    	           System.out.println(" DISPLAY 2nd MATRIX");
    	           o1.display();
    	           System.out.println("DISPALY 3rd MATRIX");
    	           o2.display();
    	           break;      
    	   }
    	   System.out.println(" DO YOU WANT TO CONTINUE"); 
    	   ch=sc.next();
       }
       
	}

}
