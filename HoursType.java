import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame {
        myFrame(){
		
		 JFrame jf=new JFrame("EXPLORING SWING");
		 jf.setLayout(new FlowLayout());
         jf.setSize(450,500);
	     jf.setVisible(true);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JButton jb1 = new JButton(new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\hourglass1.jpg"));
		 JButton jb2 = new JButton(new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\analog1.jpg"));
		 JButton jb3 = new JButton(new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\digital.jpg"));
		 JButton jb4 = new JButton(new ImageIcon("C:\\Users\\NASREEN PARWEEN\\Downloads\\timer2.jpg"));
		 JLabel jlb=new JLabel("Choose any timepiece");
		 
		 jf.add(jb1);
		 jf.add(jb2);
		 jf.add(jb3);
		 jf.add(jb4);
		 jf.add(jlb);
		 
		 jb1.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent ae)
				{
				   jlb.setText("You selected an Hourglass1");
				}
		 
		 });
		 
		 jb2.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent ae)
				{
				   jlb.setText("You selected an Analog clock");
				}
		 
		 });
		 
		 jb3.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent ae)
				{
				   jlb.setText("You selected an Digital clock");
				}
		 
		 });
		 
		 jb4.addActionListener(new ActionListener(){
		        public void actionPerformed(ActionEvent ae)
				{
				   jlb.setText("You selected an Timer1");
				}
		 
		 });
		 
		}	 
}
public class HoursType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new myFrame();
			}
		});
	}

}
