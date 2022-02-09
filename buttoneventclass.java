import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
class buttonframe extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Button blist[]=new Button[3];
	buttonframe()
	{
		b1=new Button("Blue");
		b2=new Button("Blue");
		b3=new Button("Blue");
		setLayout(new FlowLayout());
		blist[0]=(Button)add(b1);
		blist[1]=(Button)add(b2);
		blist[2]=(Button)add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
			});
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button s= (Button)ae.getSource();
		if(s==blist[0])
		{
			setBackground(Color.blue);
		}
		else if(s==blist[1])
		setBackground(Color.green);
		else if(s==blist[2])
			setBackground(Color.pink);
	}
	
}
public class buttoneventclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 buttonframe o1=new buttonframe();
 o1.setSize(600,600);
 o1.setTitle("Buttoneventhandling");
 o1.setVisible(true);
	}

}
