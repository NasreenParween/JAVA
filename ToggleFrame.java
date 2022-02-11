import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame 
{
       myFrame()
	   {
		 addMouseListener(new myMouseAdapter(this));
		 addWindowListener(new myWindowAdapter());
	   }
}
	   
	   class myWindowAdapter extends WindowAdapter{
	    public void windowClosing(WindowEvent we)
		{
		  System.exit(0);
		}
     }

	 
	 class myMouseAdapter extends MouseAdapter
	 {
		 myFrame o1;
		 int flag;
		 myMouseAdapter(myFrame o2)
		 {
			 o1=o2;
		 }
		 
		 public void mouseClicked(MouseEvent me)
		 {
		 if(flag==0)
		   { 
             o1.setBackground(Color.PINK);
             flag=1;			 
		   }
		 else
		   {
		     o1.setBackground(Color.BLUE);
             flag=0;
		   }
		 }
	 }

public class ToggleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame f=new myFrame();
		   f.setSize(500,500);
		   f.setVisible(true);
		   f.setTitle("Toggle frame window background color");
	}

}
