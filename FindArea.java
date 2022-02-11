import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class FindArea {
	FindArea(){
	JFrame f=new JFrame("Question 3");
	f.setSize(400,500);
	f.setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel circle=new JLabel("Enter radius of the circle");
	JTextField radius=new JTextField(30);
	JLabel area=new JLabel();
	f.add(circle);
	f.add(radius);


	JButton calc=new JButton("Calculate Area");
	f.add(calc);
	f.add(area);
	calc.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	double r=Double.parseDouble(radius.getText());
	double x=3.14*r*r;
	area.setText("Area of circle is "+x);

	JLabel rlength=new JLabel("Enter length of rectangle");
	JTextField length=new JTextField(10);
	JLabel rwidth=new JLabel("Enter width of rectangle");
	JTextField width=new JTextField(10);
	JLabel area2=new JLabel();
	f.add(rlength);
	f.add(length);
	f.add(rwidth);
	f.add(width);


	JButton calr=new JButton("Calculate Area");
	f.add(calr);
	f.add(area2);
	calr.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent be){
	double l=Double.parseDouble(length.getText());
	double w=Double.parseDouble(width.getText());
	double y=l*w;
	area2.setText("Area of rectangle is "+y);

	}
	});

	}
	});

	f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			new FindArea();
			}
			});
	}

}
