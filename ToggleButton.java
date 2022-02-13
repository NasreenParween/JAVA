import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class student
{
	String Name, Course, College;
	int Rollno;
	double cgpa;
	student(String s, String c, String cg, int roll, double cgpa)
	{
		Name=s;
		Course=c;
		College=cg;
		Rollno=roll;
		this.cgpa=cgpa;
	}
}
class Panel extends JPanel
{
	String msg1=" ";
	String msg2=" ";
	String msg3=" ";
	String msg4=" ";
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	g.drawString(msg1, 150, 200);
	g.drawString(msg2, 150, 220);
	g.drawString(msg3, 150, 240);
	g.drawString(msg4, 150, 260);
	}
	
}
class Button extends JFrame implements ActionListener,ItemListener
{
	JToggleButton b1;
	Panel p1;
	JLabel l1;
	student s1= new student(" Nasreen parween " , " B.Sc(H) Computer science"," SRCASW",  2020329 , 9.9 );
	Button()
	{
		super("ToggleButtonStudentDetailsCGPA");
		setSize(500,500);
		p1=new Panel();
		l1=new JLabel();
		b1=new JToggleButton("Student details/CGPA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1.setLayout(new FlowLayout());
		p1.add(b1);
		p1.add(l1);
		add(p1);
		b1.addActionListener(this);
		b1.addItemListener(this);
		setVisible(true);
			}
	public void actionPerformed(ActionEvent ae)
	{
		l1.setText(" "+ae.getActionCommand());
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(b1.isSelected())
		{
			p1.msg1="Name="+s1.Name;
			p1.msg2="Course="+s1.Course;
			p1.msg4="Rollno="+s1.Rollno;
			p1.msg3="College="+s1.College;
			b1.setText("Student Information");
			p1.repaint();
		}
		else 
		{
			p1.msg1="CGPA="+s1.cgpa;
			p1.msg2=" ";
			p1.msg3=" ";
			p1.msg4=" ";
			b1.setText("CGPA");
			p1.repaint();
		}
	}
}
public class ToggleButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
		 {
	 public void run()
	 {
		 new Button();
	 }
		 }
		 );	
	}

}
