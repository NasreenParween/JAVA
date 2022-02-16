import java.awt.*;
import java.awt.event.*;
import java.io.*;
class framepass extends Frame implements ActionListener
{
	TextField t1, t2;
	Label l1,l2,l3;
	Button b1;
	String msg= " ";
	framepass(String s)
	{
		super("My_New_Frame");
		setSize(500,500);
		l1=new Label("User Id");
		l2=new Label("Password");
		l3=new Label(" ");
		t1=new TextField(30);
		t2=new TextField(30);
		b1=new Button("Login");
		setLayout(new FlowLayout());
		t2.setEchoChar('*');
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
	public void windowClosing(WindowEvent we)
	{
		setVisible(false);
	}
		});
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		System.out.println("s1="+s1+"s2="+s2);
		if(s1.equals("nasreen999786@gmail.com")&& s2.equals("nasreen123"))
		{
			l3.setText("Successful");
		}
		else
			l3.setText("Invalid Credentials");
		repaint();	
	}
public void paint(Graphics g)
{
	g.drawString(msg, 150, 150);
}
}
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framepass f1 =new framepass("My_New_Frame");
	}

}
