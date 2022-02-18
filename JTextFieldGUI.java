//Using Swing, create the GUI interface to input number n in text box and calculate the factorial of number given in text box and set the label result to the factorial computed. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTextFieldGUI {

	   JTextField t1;
       public JTextFieldGUI()
       {
             JFrame o1=new JFrame("  JTextFieldDemo");
             o1.setLayout(new FlowLayout());
             o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 o1.setSize(400,300);
			 JLabel l=new JLabel("Enter an Integer");
			 o1.add(l);
			 JTextField t1=new JTextField(15);
             o1.add(t1);			 
			 JLabel l1=new JLabel();
			 o1.add(l1);
             t1.addActionListener(new ActionListener()
			 {
                   public void actionPerformed(ActionEvent ae)
                   {
                       int n,pro=1;
                       n=Integer.parseInt(t1.getText());
                       for(int i=1;i<=n;i++)
                       {
                            pro=pro*i;
                       }
                       l1.setText("Factorial of "+n+" is: "+pro);

                   }

          });
		   o1.setVisible(true);
       }
       public static void main(String args[]) {
            SwingUtilities.invokeLater(new Runnable(){
             public void run() 
             {
                    new JTextFieldGUI();
             }
      });
   }
}
