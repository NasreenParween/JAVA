package factorial;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, fact=1;
		n=5;
		for(int i=1; i<=n; i++)
			fact=fact*i;
		System.out.println("Factrial of given number is"+fact);

	}

}
