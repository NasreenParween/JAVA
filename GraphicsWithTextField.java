import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
	Button b1, b2, b3;
	TextField t1;
	Label l1;
	int flag=0;
	String msg=" ";
	MyFrame()
	{
		b1=new Button("Draw Figure");
		b2=new Button("Red");
		b3=new Button("Blue");
		t1=new TextField(40);
		l1=new Label("Enter the figure name");
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
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
		String s= ae.getActionCommand();
		if(s.equals("Draw Figure"))
		{
			String s1= t1.getText();
			msg= s+s1;
			if(s1.equals("Line"))
				flag=1;
			else if(s1.equals("Rectangle"))
		        flag=2;
			else if(s1.equals("Polygon"))
				flag=3;
		}
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
		g.drawString(msg,150, 150);
		if(flag==1)
		g.drawLine(50,100,100,100);
		else if(flag==2)
			g.drawRect(50, 100, 100, 100);
		else if(flag==3)
			g.drawPolygon(x, y, 5);
	}
	
}
public class GraphicsWithTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame o1=new MyFrame();
		 o1.setSize(new Dimension(400,400));
		 o1.setTitle("Graphics with text");
		 o1.setVisible(true);
	}

}
