import java.awt.*;
import java.awt.event.*;

class myFrame3 extends Frame implements MouseListener,MouseMotionListener
{
     String msg=" ";
	 int x=100,y=100;
	 int x1,y1;
	 int num;
	 int first, second,third;
	 
	 myFrame3()
	 {
		 num=0;
		 first = 0;
		 second = 1;
	 }
	 
	 public void paint(Graphics g)
	 {
	    g.drawString(msg,x1,y1);
	 }
	 
	 public int fibonacci(int f, int s)
	 {
	    
		return (f+s);
	 }
	 
	 public void mouseClicked(MouseEvent me)
	 {
			if(num==0) 
			{
			  msg=Integer.toString(first);
			  num=num+1;
			}
			else if(num==1) 
			{
			  msg=msg+","+Integer.toString(second); 
			  num=num+1;				
			}
			else
			{
			  third = fibonacci(first,second);
			  first=second;
			  second=third;
			  msg=msg+","+Integer.toString(third);
			}	
			x1=me.getX();
            y1=me.getY();
            repaint();
	 }
          
         public void mouseEntered(MouseEvent me) { }
         public void mouseExited(MouseEvent me) { }
         public void mousePressed(MouseEvent me) { }
         public void mouseReleased(MouseEvent me) { }
         public void mouseDragged(MouseEvent me) { }
         public void mouseMoved(MouseEvent me) { }
}
public  class ClickFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myFrame3 f = new myFrame3();      
         f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
				 f.addMouseListener(f);
				 f.addMouseMotionListener(f);
				 
				 f.setLayout(new FlowLayout());
				 f.setVisible(true);
				 f.setTitle("On every Click get Fibonacci");
				 f.setSize(500,500);
	}

}
