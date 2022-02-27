import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Fkey extends Frame
{
	FileOutputStream f1;
	String str=" ";
	Fkey()
	{
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke)
			{
				str+=ke.getKeyChar();
				repaint();
			}
		});
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			setVisible(false);
		try
		{
			f1=new FileOutputStream("C:\\Users\\NASREEN PARWEEN\\eclipse-workspace\\Test2\\A2.txt");
			for(int i=0;i<str.length();i++)
			{
				f1.write(str.charAt(i));
			}
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("unable to open file");
		}
		catch(IOException io)
		{
			System.out.println("unable to read file");
		}

		}
		});
		
	}
	public void paint(Graphics g)
	{
		g.drawString(str,150,100);
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fkey f1=new Fkey();
		f1.setSize(400,400);
		f1.setTitle("AWT TO FILE COPY");
		f1.setVisible(true);

	}

}
