import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements MouseListener,MouseMotionListener
{
     String msg=" ";
	 int x=100,y=100;
	 int x1,y1;
	 int num=1;
	 
	 public void paint(Graphics g)
	 {
	    g.drawString(msg,x1,y1); //prints coordinates on every click (wherever on the screen)
	    //g.drawString(msg,x,y);    //prints coordinates on defined coordinates i.e (100,100)
	 }
	 
	 public int factorial(int n)
	 {
	    int pro=1;
		for(int i=1;i<n;i++)
		
		  pro=pro*i;
		  return pro;
		
	 }
	 
	 public void mouseClicked(MouseEvent me)
	 {
	        //int num;
            int n;
			n=factorial(num); 
            num=num+1;
			msg=Integer.toString(n);
			//num.msg=num.msg+n;
            x1=me.getX();
            y1=me.getY();
            repaint();
	 }
          
         public void mouseEntered(MouseEvent me) { }
         public void mouseExited(MouseEvent me) { }
         public void mousePressed(MouseEvent me) { }
         public void mouseReleased(MouseEvent me) { }
         public void mouseDragged(MouseEvent me) { }
         public void mouseMoved(MouseEvent me) 
		 {
			 /*
			 int n;
			 x=100
			n=factorial(num);
            num=num+1;
			msg=msg+n;
			 x1=me.getX();
             y1=me.getY();
			 repaint();
            */

	     }
}
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myFrame f = new myFrame();      
         f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
				 f.addMouseListener(f);
				 f.addMouseMotionListener(f);
				 
				 f.setLayout(new FlowLayout());
				 f.setVisible(true);
				 f.setTitle("On every Click get Factorial");
				 f.setSize(500,500);
	}

}
