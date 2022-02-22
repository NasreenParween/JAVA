import java.awt.*;  
import java.awt.event.*;

class myFrame extends Frame{

       public void paint(Graphics g)
	   {
              g.drawLine(60,100,150,200);
              //g.drawRect(200,210,250,90);
              g.fillRect(200,210,250,90);
              g.drawRoundRect(300,310,250,90,15,15);
	   }

}

class myWindowAdapter extends WindowAdapter
		   {
            public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		   }
	 	 
class IntroGraphics{
        public static void main(String args[])
		{
		   myFrame f=new myFrame();
		   f.setSize(500,500);
		   f.setVisible(true);
                   f.addWindowListener(new myWindowAdapter());
		   f.setTitle("Introduction to Graphics!");
		}

}
