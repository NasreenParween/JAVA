import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFramefibonnaci{
	     
	
        myFramefibonnaci()
		{
		  JFrame jf = new JFrame();
		  jf.setSize(500,500);
		  jf.setVisible(true);
		  jf.setLayout(new FlowLayout());
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  JLabel l1 = new JLabel("Enter number of terms");
		  JLabel l2 = new JLabel();
		  
		  
		  JTextField t1 = new JTextField(25);
		  
		  
		  JButton b1 = new JButton("Display Series");
		  
		  jf.add(l1);
		  jf.add(t1);
		  jf.add(b1);
		  jf.add(l2);
	
		  b1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae)
			 {
				 
				int num = Integer.parseInt(t1.getText());
				int a=0,b=1;
				String s;
				s=a+" "+b;
				l2.setText(s);
				for(int i=3;i<=num;i++)
				{
					int sum=a+b;
					s+=" "+sum;
					l2.setText("Series: "+s);
					a=b;
					b=sum;
				}
				
			 }			 
		  });
		}
}

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SwingUtilities.invokeLater(new Runnable(){
				public void run()
				{
					new myFramefibonnaci();
				}
		});
	}

}
