import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
	Button b1, b2, b3, b4,b5;
	int flag=0;
	MyFrame()
	{
		b1=new Button("Line");
		b2=new Button ("Rectangle");
		//b3=new Button("Polygon");
		b4= new Button("Red");
		b5=new Button("Blue");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		//add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		//b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
	}
	public void actionPerformed(ActionEvent ae) {
		String s= ae.getActionCommand();
		if(s.equals("Line"))
		flag =1;
		else if(s.equals("Rectangle"))
			flag=2;
		//else if(s.equals("Polygon"))
		 //flag=3;
		  else if(s.equals("Red"))
			  setForeground(Color.RED);
		  else if(s.equals("Blue"))
		      setForeground(Color.BLUE);		
		 repaint();	
	}
	public void paint(Graphics g)
	{
		int x[]= {150,155,155,145,145};
		int y[]= {150,155,160,160,155};
		if(flag==1)
		g.drawLine(50,100,100,100);
		else if(flag==2)
			g.drawRect(50, 100, 100, 100);
		//else if(flag==3)
		//g.drawPolygon(x, y,5);
	}
	
}
public class ButtonGraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MyFrame obj1=new MyFrame();
 obj1.setSize(new Dimension(400,400));
 obj1.setTitle("Button with graphics");
 obj1.setVisible(true);
	}

}
