//Using Swing, write a program to display a string in frame window with pink color as background. 

import javax.swing.*;
import java.awt.*;
public class JavaswingC{
JavaswingC()
{
     JFrame o1=new JFrame("Simple Swing Application");
     o1.setSize(300,400);
     o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     o1.getContentPane().setBackground(Color.PINK);
     o1.setVisible(true);
     JLabel jl=new JLabel("Hello World!!");
}


  public static void main(String agrs[]) {
 SwingUtilities.invokeLater(new Runnable(){
    public void run()
    {
       new JavaswingC();
    }
}
);
    }
}

