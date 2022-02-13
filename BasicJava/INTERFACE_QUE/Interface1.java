class interfacemain implements I2
{
	public void callme(int p)
	{
		System.out.println(p);
	}
    public void display()
	{
		System.out.println("Interface display function");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacemain o1=new interfacemain();
		o1.callme(64);
		o1.display();
			
	}

}
