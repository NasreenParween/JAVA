package pck1;
class balance
{
	double amount;
	balance(double x)
	{
		amount=x;
	}
	void display()
	{
		System.out.println(amount);
	}
}

public class accountbal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
balance o1[]=new balance[3];
o1[0]=new balance(344.4);
o1[1]=new balance(1234.6);
o1[2]=new balance (234.7);
for(int i=0; i<3; i++)
	o1[i].display();
	}

}
