import java.awt.*;
import java.awt.event.*;
class myframefact extends Frame implements ActionListener
{
	Button b1;
	Label l1,l2;
	TextField t1;
	String msg=" ";
	myframefact()
	{
		b1=new Button("Factorial");
		t1=new TextField(30);
		l1=new Label("Enter the number");
		l2=new Label ("Result");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(b1);
		setBackground(Color.green);
		b1.addActionListener(this);
		addWindowListener(new MyWindowAdapterfact(this));
	}
		public void actionPerformed(ActionEvent ae)
		{
			String s=t1.getText();
			msg="Factorial is";
			int n=Integer.parseInt(s);
			int fact=1;
			for(int i=1; i<=n; i++)
				fact=fact*i;
			msg+=Integer.toString(fact);
			repaint();
		}
		public void paint(Graphics g)
		{
			g.drawString(msg, 100, 100);
		}
			
	}
class MyWindowAdapterfact extends WindowAdapter
{
	myframefact o1;
	MyWindowAdapterfact(myframefact o2)
	{
	o1=o2;	
	}
	public void windowClosing(WindowEvent we)
	{
		o1.setVisible(false);
	}
	
}

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  myframefact o1=new myframefact();
  o1.setTitle("Factorial");
  o1.setSize(400,400);
  o1.setVisible(true);
	}

}
