import javax.swing.*;
import java.awt.*;
class Contactus extends JFrame
{   JLabel j,j2;
    public Contactus()
    {
        j =new JLabel(new ImageIcon("bk3.jpg"));
        j.setBounds(0,0,1200,700);
        add(j);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        j2=new JLabel("<html><br/><br/><br/>Ritesh Patel (Developer)<br/>9140287372<br/>riteshp112@gmail.com<br/><br/><br/>Shubham Rawat (Project Coordinator)<br/>7571961641<br/>shubham.rawart10323@gmail.com<br/><br/><br/>Saksham Dubey(Designer)<br/>7458877985<br/>sakshamking3421@gmail.com<br/><br/><br/>Rohit Sharma(Analyst)<br/>9628178652<br/>anonymusdream6392@gmail.com<html>");
        j2.setFont(new Font("Serif",Font.PLAIN,20));
j2.setForeground(Color.BLACK);
j.add(j2);
        j.setLayout(new FlowLayout());
        setVisible(true);
        setSize(1700,790);
    }
    public static void main(String args[])
    {new Contactus();
   }
}
