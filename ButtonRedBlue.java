import java.awt.*;
import java.awt.event.*;
class Myframebutton extends Frame implements ActionListener
{
	Button b1,b2;
	Myframebutton()
	{
		b1=new Button("Red");
		b2=new Button("Blue");
		setLayout (new FlowLayout());
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new MyWindowAdapterbut(this));	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Red"))
		setBackground(Color.red);
		else if(s.equals("Blue"))
			setBackground(Color.blue);
	}
}
class MyWindowAdapterbut extends WindowAdapter
{
	Myframebutton o1;
	MyWindowAdapterbut(Myframebutton o2)
	{
		o1=o2;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}	
}

public class ButtonRedBlue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Myframebutton o1=new  Myframebutton();
   o1.setTitle("ButtonEventHndling");
   o1.setSize(new Dimension(400,400));
   o1.setVisible(true);
	}

}
