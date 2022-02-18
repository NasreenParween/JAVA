import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame {
    myFrame(){
	   addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent we){
		  System.exit(0);
		}
	   });
	}
}

class LabelDemo{
   public static void main(String args[]){
       myFrame f = new myFrame();
	   String str;
	   //f.setLayout(new FlowLayout());   //this is important (left to right,top to Bottom alignment)
	   Label l1 = new Label("One",Label.CENTER);
	   Label l2 = new Label("Two");
	   Label l3 = new Label("Three");
	   //l3.setText("Three");
	   str = l3.getText();
	   f.add(l1);
	   f.add(l2);
	   f.add(l3);
	   //System.out.println(str);
	   f.setVisible(true);
	   f.setSize(500,500);
	   f.setTitle("Label Demo");
	   
   }
}