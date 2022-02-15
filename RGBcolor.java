import java.awt.*;
import java.awt.event.*;
class colorX extends Frame implements ActionListener
{
	int r=255;
	int g=255;
	int b=255;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1;
	colorX()
	{
	setLayout(new FlowLayout());
	t1=new TextField(30);
	t2=new TextField(30);
	t3=new TextField(30);
	b1=new Button("Color");
	l1=new Label("Red");
	l2=new Label("Green");
	l3=new Label("Blue");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b1);
	l4=new Label("make a different color");
	add(l4);
	b1.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
	t3.addActionListener(this);
	addWindowListener(new WindowAdapter()
			{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
			});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		r= Integer.parseInt(s1);
		g= Integer.parseInt(s2);
		b= Integer.parseInt(s3);
		repaint();
	}
	public void paint(Graphics c)
	{
		Color cc= new Color(r, g ,b);
		setBackground(cc);
		
	}
}
public class RGBcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 colorX c1 =new colorX();
 c1.setSize(600,600);
 c1.setTitle("CHANGE COLOR");
 c1.setVisible(true);
	}

}
