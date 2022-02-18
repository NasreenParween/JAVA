//Using Swing, write a program which responds to character typed in textbox and set the text of label equal to the text typed in textbox when pressed enter . 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JText {

       public JText()
       {
             JFrame o1=new JFrame("  JTextFieldDemo");
             o1.setLayout(new FlowLayout());
             o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 o1.setSize(400,300);
			 JTextField t1=new JTextField(50);
             o1.add(t1);		

             JLabel l=new JLabel();
             o1.add(l);			 
             t1.addActionListener(new ActionListener()
			 {
                   public void actionPerformed(ActionEvent ae)
                   {
                       l.setText(t1.getText());
                   }

          });
		   o1.setVisible(true);
       }
       public static void main(String args[]) {
            SwingUtilities.invokeLater(new Runnable(){
             public void run() 
             {
                    new JText();
             }
      });
   }
}
