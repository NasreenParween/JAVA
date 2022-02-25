import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class pane2 extends JPanel
{
String msg="Hello1";
protected void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawString(msg,  100, 200);
}
}
class threeButton extends JFrame implements ActionListener
{
JButton b1, b2, b3;
JTextField t1,t2;
JLabel l1,l2;
String msg=" ";
String msg1=" ";
pane2 p1;
threeButton()
{
super("calculate factorial,fibonnaci, and Gcd ");
p1=new pane2();
b1=new JButton("Factorial");
b2=new JButton("Fibonnaci");
b3=new JButton("GCD");
t1=new JTextField(30);
l1=new JLabel("Enter the number");
l2=new JLabel("Result");
t2=new JTextField(30);
setSize(400,400);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   p1.setLayout(new FlowLayout());
p1.add(l1);
p1.add(t1);
   p1.add(t2);
p1.add(b1);
p1.add(b2);
   p1.add(b3);
   p1.add(l2);
   add(p1);
setVisible(true);
b1.addActionListener(this);


b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
int a=0,b=1,i=2,s=0;
msg+=a+b;
String s1=t1.getText();
int n;
n=Integer.parseInt(t1.getText());
while(i<=n)
{
s=a+b;
a=b;
b=s;
p1.msg+="fibonnaci "+s;
i++;
}
l2.setText(p1.msg);
p1.repaint();

}
});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
String s1=t1.getText();
String s2=t2.getText();
int x,y, rem;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
int gcd=1;
rem=x%y;
    while(rem!=0)
    {
    x=y;
    y=rem;
    rem=x%y;
    }
    if(rem==0)
    p1.msg="GCD"+y;
    l2.setText(p1.msg);
    p1.repaint();    
}

});

}
public void actionPerformed(ActionEvent ae)
{
int fact=1;
int n;
String s1=ae.getActionCommand();
if(s1.equals("Factorial"))
{
	n= Integer.parseInt(t1.getText());
String s=t1.getText();
for(int i=1; i<=n; i++)
{
fact=fact*i;
}
p1.msg="factorial is"+fact;
l2.setText(p1.msg);
p1.repaint();
}
}

}
 class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new threeButton();
	}
		});
	}

}
