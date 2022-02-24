import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class labelimage {
	labelimage()
	{
		JFrame f1=new JFrame("Rose Image");
		String s1="C:\\Users\\NASREEN PARWEEN\\eclipse-workspace\\SwingProgram\\src\\";
		JTextField t1;
		t1=new JTextField(30);
		f1.setSize(400,400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1;
		l1=new JLabel("Different Rose name");
		t1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae)
			{
				String s2=t1.getText();
				ImageIcon i1;
				String str;
				str=s1+s2+".jpg";
				i1=new ImageIcon(str);
				l1.setIcon(i1);
			}
				});
		f1.setLayout(new FlowLayout());
		f1.add(l1);
		f1.add(t1);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new labelimage();
	}
		});
}
}
