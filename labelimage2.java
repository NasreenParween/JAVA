import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class labelimage2 {
	labelimage2()
	{
		JFrame f1=new JFrame("Rose Image");
		f1.setSize(500,500);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1;
		ImageIcon i1;
		i1= new ImageIcon("C:\\Users\\NASREEN PARWEEN\\eclipse-workspace\\SwingProgram\\src\\pinkRose.jpg");
		l1=new JLabel("Beautiful picture");
		f1.setLayout(new FlowLayout());
		f1.add(l1);
		l1.setIcon(i1);
		l1.setText("pinkRose");
		f1.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new labelimage2();
			}
				});

	}

}
