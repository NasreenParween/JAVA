import java.awt.*;
import java.awt.event.*;
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
class Myframebutton2 extends Frame implements ActionListener
{
	Button b1,b2;
	String msg=" ";
	student s1= new student("Mahi","B.sc(h) Computer Science","SRCASW", 3553 ,9.9);
	Myframebutton2()
	{
		b1=new Button("A");
		b2=new Button("B");
		setLayout (new FlowLayout());
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		addWindowListener(new MyWindowAdapterb2(this));
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		msg=" ";
		if(s.equals("A"))
		msg+="Name : "+s1.Name+ "Course : "+s1.Course+ "College : " +s1.College+ "Rollno : " +s1.Rollno;
		else if(s.equals("B"))
			msg+="CGPA : "+s1.cgpa;
		repaint();		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 100, 100);
	}	
}
class MyWindowAdapterb2 extends WindowAdapter
{
	Myframebutton2 o1;
	MyWindowAdapterb2(Myframebutton2 o2)
	{
		o1=o2;
	}
	public void windowClosing(WindowEvent ae)
	{
		o1.setVisible(false);
	}	
}

public class Buttonstudentcgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframebutton2 o1=new  Myframebutton2();
		   o1.setTitle("ButtonEventHndling2");
		   o1.setSize(new Dimension(400,400));
		   o1.setVisible(true);
	}

}
