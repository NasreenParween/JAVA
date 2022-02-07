import java.awt.*;
import java.awt.event.*;
class myframe1 extends Frame implements ActionListener
{
	Button b1;
	Label l1,l2;
	TextField t1;
	String msg=" ";
	myframe1()
	{
		b1=new Button("A");
		l1= new Label("Enter the number");
		l2= new Label(" ");
		t1=new TextField(30);
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		setBackground(Color.cyan);
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t1.getText();
		String s= ae.getActionCommand();
		int x;
			x=Integer.parseInt(s1)*2;
			msg="Result is"+x;
			l2.setText("Result is"+x);
			repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,  150,  150);
	}
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myframe1 o1=new myframe1();
		o1.setSize(500,500);
		o1.setTitle("Calculator");
		o1.setVisible(true);
	}

}
