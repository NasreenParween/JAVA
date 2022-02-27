import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class panel extends JPanel
{
	String msg=" ";
	String msg1=" ";
    protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg, 100, 120);
		g.drawString(msg, 100, 140);
	}
}
class loginpage extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	panel p;
	Font f1;
	int count=0;
	ImageIcon i1,i2;
	JTextField t1,t2;
	JLabel l1,l2,l3;
	loginpage()
	{
		i1= new ImageIcon("");
		i2=new ImageIcon(" ");
	    b1=new JButton(i1);
	    b2=new JButton(i2);
	    f1=new Font("Serif", Font.ITALIC,16);
	    t2.setFont(f1);
	    b3=new JButton("Submit");
	    b4=new JButton("clear");
	    l1=new JLabel("User Id");
	    l2=new JLabel("Password");
	    l3=new JLabel(" ");
	    p=new panel();
	    p.getSize(new Dimension());
	    t1=new JTextField(20);
	    t2=new JTextField(20);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    p.setLayout(new FlowLayout());
	    p.add(l1);
	    p.add(t1);
	    p.add(l2);
	    p.add(t2);
	    p.add(b3);
	    p.add(b4);
	    p.add(l3);
	    p.add(b1);
	    p.add(b2);
	    setTitle("login page");
	    setVisible(true);
	    setSize(600,600);
	    b3.setBackground(Color.pink);
	    b4.setBackground(Color.red);
	    t1.setBackground(Color.LIGHT_GRAY);
	    t2.setBackground(Color.LIGHT_GRAY);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		t1.setFont(f1);
		t2.setFont(f1);
		String s=ae.getActionCommand();
		if(s.equals("Submit"))
		{
			if(count>=2)
			{
				p.setForeground(Color.red);
				p.setForeground(Color.red);
				p.msg="ATTENTION!!!";
				p.msg1="maximum time of reentering of userid and password has reached";
				l3.setFont(f1);
				l3.setText("One more wrong attempt---> page will be closed");
			   if(count==5)
			   {
				   System.exit(0);
			   }
			   count++;		
			}
			else if(s1.equals("nasreen999786@gmail.com")&&s2.equals("nasreen@2003"))
			{
				l3.setForeground(Color.pink);
				l3.setText("login successfull");
			}
			else if(count<4)
			{
				l3.setForeground(Color.red);
				l3.setText("Invalid userId/password---->wanna try again?");
				count++;
			}
			}
		else if(s.equals("Clear"))
		{
			t1.setText(null);
			t2.setText(null);
		}
	}
}
public class setPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SwingUtilities.invokeLater(new Runnable()
		 {
	 public void run()
	 {
		 new loginpage();
	 }
		 });
	}

}
