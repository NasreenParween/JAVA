import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class framesave extends JFrame implements ActionListener
{
	JButton b1;
	JTextField t1;
	JLabel l1;
	FileOutputStream f1;
	framesave()
	{
		super("FileSave");
		setSize(500,500);
		b1=new JButton("Submit");
		b1.setActionCommand("Submit1");
		t1=new JTextField(30);
		l1=new JLabel();
		setLayout(new FlowLayout());
		add(b1);
		add(t1);
		add(l1);
		b1.addActionListener(this);
		getContentPane().setBackground(Color.yellow);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=t1.getText();
		System.out.println("s="+s+"actioncommand="+ae.getActionCommand());
		try
		{
			f1=new FileOutputStream("A2.txt", true);	
			for(int i=0; i<s.length(); i++)
					{
				System.out.println("char="+s.charAt(i));
				f1.write(s.charAt(i));
					}
			//System.out.println("file copied");
			l1.setText("file copied");
			t1.setText(" ");
		}
		catch(FileNotFoundException o1)
		{
			System.out.println(o1);
		}
		catch(IOException o1)
		{
			System.out.println(o1);
		}
	}
}
public class FileSaveWithButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		{
	public void run()
	{
		new framesave();
	}
		});
	}

}
