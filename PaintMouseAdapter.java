import java.awt.*;  //for class Graphics     (Frame is in class Container which is inherited from Component)
import java.awt.event.*;

class myFrame extends Frame{

       String msg;
	   int x,y;
	   
	   myFrame()
	   {
		 addMouseListener(new myMouseAdapter(this));
		 addWindowListener(new myWindowAdapter());   //can also register in constructor of the class
	     msg=" ";
		 x=0;
		 y=0;
	   }

       public void paint(Graphics g)
	   {
	      g.drawString(msg,x,y);
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
		 myMouseAdapter(myFrame o2)
		 {
			 o1=o2;     //current object is assigned to reference variable of the class 
		 }
	     public void mouseClicked(MouseEvent me)
		 {
		   o1.msg="Mouse Clicked..";
           o1.x=100;
           o1.y=100;
           o1.repaint();		   
		 }
		 
		 public void mouseEntered(MouseEvent me)
		 {
		   o1.msg="Mouse Entered..";
           o1.x=200;
           o1.y=200;
           o1.repaint();		   
		 }
		 
		 public void mouseExited(MouseEvent me)
		 {
		   o1.msg="Mouse Exited..";
           o1.x=300;
           o1.y=300;
           o1.repaint();		   
		 }

	 
	 }
	 
	 
class PaintMouseAdapter{
        public static void main(String args[])
		{
		   myFrame f=new myFrame();
		   f.setSize(500,500);
		   f.setVisible(true);
		   f.setTitle("Paint() Demo with Adapter Classes");
		   //f.addWindowListener(new myWindowAdapter());
		   //f.addMouseListener(new myMouseAdapter());
		
		}

}
