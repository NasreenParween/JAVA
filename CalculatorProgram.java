import java.awt.*;
import java.awt.event.*;
class myframecalc extends Frame implements ActionListener
{
	Button b1, b2, b3 , b4,b5 ,b6;
	Label l1, l2;
	TextField t1,t2;
	String msg=" ";
	myframecalc()
	{
		b1=new Button("+");
		b2=new Button("*");
		b3= new Button("-");
		b4= new Button("%");
		b5=new Button("/");
		b6= new Button("clear");
		l1= new Label("Enter the number");
		l2= new Label("Enter the number");
		t1=new TextField(30);
		t2=new TextField(30);
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setBackground(Color.cyan);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
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
		String s2=t2.getText();
		String s= ae.getActionCommand();
		int x=0;
		if(s.equals("+"))
		{
			x=Integer.parseInt(s1)+Integer.parseInt(s2);
			msg="Result is"+x;
			repaint();
		}
		else if(s.equals("*"))
		{
			x=Integer.parseInt(s1)*Integer.parseInt(s2);
			msg="Result is"+x;
			repaint();
		}
		else if(s.equals("-"))
		{
		x=Integer.parseInt(s1)-Integer.parseInt(s2);
		msg="Result is"+x;
		repaint();	
	   }
		else if(s.equals("%"))
		{
		x=Integer.parseInt(s1)%Integer.parseInt(s2);
		msg="Result is"+x;
		repaint();	
	   }
		else if(s.equals("/"))
		{
		x=Integer.parseInt(s1)/Integer.parseInt(s2);
		msg="Result is"+x;
		repaint();	
	   }
		else if(s.equals("clear"))
		{
			t1.setText("0");
			t2.setText("0");
		}
}
	public void paint(Graphics g)
	{
		g.drawString(msg,  150,  150);
	}
}
public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myframecalc o1=new myframecalc();
o1.setSize(500,500);
o1.setTitle("Calculator");
o1.setVisible(true);
	}

}
