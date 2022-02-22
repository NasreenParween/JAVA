import java.awt.*;  
import java.awt.event.*;

class myFrame extends Frame{
       final int inc = 25;
       int max = 500;
       int min = 200;
       Dimension d;
       String msg;

       myFrame() {
addMouseListener(new MouseAdapter(){
public void mouseclicked(MouseEvent me){

int w = (d.width + inc)>max?min:(d.width+inc);
int h = (d.height + inc)>max?min:(d.height+inc);
}
});

addWindowListener (new WindowAdapter(){
            public void windowClosing(WindowEvent we)
			{
			System.exit(0);
			}
		   });
}

       public void paint(Graphics g)
	   {
              //g.drawLine(60,100,150,200);
              Insets i = getInsets();
              d = getSize();
              g.drawLine(i.left,i.top,d.width-i.right,d.height-i.bottom);
              //g.drawLine(i.left,i.top,d.width-i.right,d.height-i.bottom);

              //g.drawRect(200,210,250,90);
              g.fillRect(200,210,250,90);
              g.drawRoundRect(300,310,250,90,15,15);
	   }

}


	 	 
class GraphicsInsets{
        public static void main(String args[])
		{
		   myFrame f=new myFrame();
		   f.setSize(500,500);
		   f.setVisible(true);
                   //f.addWindowListener(new myWindowAdapter());
		   f.setTitle("Introduction to Insets");
		}

}
