import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements ActionListener {

    public void actionPerformed(ActionEvent ae){
	  String label = ae.getActionCommand();
	  if (label == "ADD")
	    System.out.println("You Clicked Add");
	  else if (label == "EDIT")
	    System.out.println("You Clicked Edit");
	  else if (label == "DELETE")
	    System.out.println("You Clicked Delete");
	}
    myFrame(){
	   addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent we){
		  System.exit(0);
		}
	   });
	}
}

class ButtonDemo{
   public static void main(String args[]){
       myFrame f = new myFrame();
	   String str;
	   f.setLayout(new FlowLayout());   //this is important (left to right,top to Bottom alignment)
	   Button b1 = new Button("ADD");
	   Button b2 = new Button("EDIT");
	   Button b3 = new Button("DELETE");
	   
	   f.add(b1);
	   f.add(b2);
	   f.add(b3);
	   
	   b1.addActionListener(f);
	   b2.addActionListener(f);
	   b3.addActionListener(f);
	  
	   f.setVisible(true);
	   f.setSize(500,500);
	   f.setTitle("Button Event Handling Demo");
	   
   }
}