import java.io.*;
import java.util.*;

class NegAge extends Exception{
    int age_n;
    NegAge(int a){
        age_n=a;
    }
    public String toString(){
        return("Error: Age cannot be negative!");
    }
}
class ElectricityBill {
	private int consumerNo;
	private String consumerName;
	private int consumerAge;
	private String consumerAddress; 
	private int numUnitsConsumed;
	private int count;
	
	public ElectricityBill(int cno, String cname, int cage, String cadd, int nunits) {
		count +=1;
		consumerAddress = cadd;
		consumerAge = cage;
		numUnitsConsumed = nunits;
		consumerNo = cno;
	    consumerName = cname;
	}
	
	public void display() {
		System.out.println("CONSUMER NUMBER: "+ this.consumerNo);
        System.out.println("CONSUMER NAME:"+ this.consumerName);
        System.out.println("CONSUMER AGE: "+this.consumerAge);
        System.out.println("CONSUMER ADDRESS: "+this.consumerAddress);
		System.out.println("NUMBER OF UNITS CONSUMED: " + this.numUnitsConsumed);
	}
	
	public void  calculate()
	{
		float bill = 0;
		if (this.numUnitsConsumed >= 1 && this.numUnitsConsumed<=100)
		{
			bill += 500;
		}
		else if (this.numUnitsConsumed >= 101 && this.numUnitsConsumed<=200)
		{
			bill += (float) (1*this.numUnitsConsumed) + 500;
		}
		else if (this.numUnitsConsumed >= 201 && this.numUnitsConsumed<=300)
		{
			bill += (float) (1.2*this.numUnitsConsumed) + 500;
		}
		else if (this.numUnitsConsumed > 300)
		{
			bill = (float) (1.5*this.numUnitsConsumed + 500);
		}
		
		System.out.println("MONTHLY BILL: " + bill);
	}
	
	public void displayCount()
	{
		System.out.println("NUMBER OF CONSUMERS: " + count);
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int a;
        System.out.println("Enter CONSUMER NUMBER: ");
        int no = scn.nextInt();
        System.out.println("Enter CONSUMER NAME: ");
        String name = scn.next();
        System.out.println("Enter CONSUMER AGE:");
        a = scn.nextInt();
        try{
            
            check(a);
        }
        catch(NegAge e) {
            System.out.println(e);
             System.exit(0);
        }
        System.out.println("Enter CONSUMER ADDRESS: ");
        String add = scn.next();
        System.out.println("Enter NUMBER OF UNITS CONSUMED: ");
        int units = scn.nextInt();
        ElectricityBill e = new ElectricityBill(no,name,a,add,units);
        e.display();
        e.calculate();
        e.displayCount();

	}
	static void check(int x)throws NegAge {
        if(x<0)
            throw new NegAge(x);
	}

}
