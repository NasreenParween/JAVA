import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class framef2 extends JFrame implements ItemListener
{
	JToggleButton b2;
	String print=" ";
	JLabel l1;
	framef2()
	{
		
		b2=new JToggleButton("Even/Odd");
		l1=new JLabel();
		setLayout(new FlowLayout());
		add(b2);
		add(l1);
		b2.addItemListener(this);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(b2.isSelected())
		{
			for(int i=0;i<=100;i++)
			{
				if(i%2==0)
					print+=" "+i;
			}
			l1.setText("Even Numbers :"+print);
		}
		else
		{
			
			for(int i=0;i<=100;i++)
			{
				if(i%2!=0)
					print+=" "+i;
			}
			l1.setText("Odd Numbers :"+print);
		}
	}
}
/*public class togglet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
		new framef2();
	}
});
	}

}
/*class pane1 extends JPanel
{
	String msg=" ";
	String msg1=" ";
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg,  250, 350);
		g.drawString(msg1,  250, 400);
	}
}

class myFrame {
	
	String msg1="";
	JFrame jf=new JFrame("display even and odd number");
        myFrame()
        {
		Panel p1;
		p1=new Panel();
          jf.setLayout(new FlowLayout());
		 JToggleButton b1 = new JToggleButton("EVEN/ODD");
		 JLabel l1 = new JLabel();
         jf.setSize(450,500);
	     jf.setVisible(true);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.add(p1);
	     jf.add(l1);
	     jf.add(b1);
        b1.addItemListener(new ItemListener(){
		        public void itemStateChanged(ItemEvent ae)
		        {
		    
		        	if(b1.isSelected())
		        	{
		        		b1.setText("EVEN NUMBER");
		        		for(int i=0;i<=100;i++)
					{
						if(i%2==0)
						{
							p1.msg+=i;
						}
					}
					p1.msg1=" ";
					p1.repaint();
				}
		     }
				
				else
				{
					b1.setText("ODD NUMBER");
					for(int i=0;i<=100;i++)
					{
						if(i%2!=0)
						{
							p1.msg1+=i;
						}
					}
					p1.msg=" ";
					p1.repaint();
				}
        });
        }
  }*/
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new framef2();
			}
		});
	}
}
