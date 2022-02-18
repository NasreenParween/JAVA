import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame {
           
		   
}

class Adapter{
        public static void main(String args[])
		{
		    myFrame f = new myFrame();
			f.addWindowListener(new myWindowAdapter());
			f.addMouseListener(new myMouseAdapter());
			f.setVisible(true);
			f.setSize(400,500);
			f.setTitle("My Frame Demo Using Adapter classes");
		
		}
}

class myWindowAdapter extends WindowAdapter
		   {
            public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		   }

       
class myMouseAdapter extends MouseAdapter
		   {
              public void mouseClicked(MouseEvent me)
			  {
			     System.out.println("Mouse Clicked..");
			
			  }
			  
			  public void mouseEntered(MouseEvent me)
			  {
			     System.out.println("Mouse Entered..");
			  }
			
			  
			  public void mouseExited(MouseEvent me)
			  {
			     System.out.println("Mouse Exited..");
			
			  }
           }