import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Home extends JFrame implements ActionListener
{ JLabel j;
    JLabel j1,j2;
    JButton cp,au,cu,ex;
    public Home()
    { System.setProperty("java.awt.headless", "false"); //Disables headless
j1=new JLabel("P R I C E       C A L C U L A T O R");  
      j1.setBounds(355,10,800,100);
j1.setFont(new Font("Serif",Font.PLAIN,50));
j1.setForeground(Color.WHITE);
j =new JLabel(new ImageIcon("bk.jpg"));
        j.setBounds(0,0,1200,700);
j.add(j1);
        setTitle("Background Color for JFrame");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
j.setLayout(null);
        setLayout(null);
        setContentPane(j);
        setLayout(null);
     setSize(399,499);
        setSize(1200,700);
      cp=new JButton("Calculate Price");
      cp.setBounds(570,210,225,50);
cp.setOpaque(true);
cp.setFont(new Font("Serif",Font.PLAIN,30));
cp.setForeground(Color.BLUE);
      j.add(cp);
     au=new JButton("About Us");
      au.setBounds(570,310,225,50);
au.setOpaque(true);
au.setFont(new Font("Serif",Font.PLAIN,30));
au.setForeground(Color.BLUE);
      j.add(au);
     cu=new JButton("Contact Us");
      cu.setBounds(570,410,225,50);
cu.setOpaque(true);
cu.setFont(new Font("Serif",Font.PLAIN,30));
cu.setForeground(Color.BLUE);
      j.add(cu);
     ex=new JButton("Exit");
      ex.setBounds(570,510,225,50);
ex.setOpaque(true);
ex.setFont(new Font("Serif",Font.PLAIN,30));
ex.setForeground(Color.BLUE);
      j.add(ex);
cp.addActionListener(this); 
au.addActionListener(this); 
cu.addActionListener(this); 
ex.addActionListener(this); 
   }
  public  void actionPerformed(ActionEvent e)
         {   if(e.getSource()==cp)
                  {
                  
                   new Price();

                  }
              else if(e.getSource()==au)
                  new About();
              else if(e.getSource()==cu)
                  new Contactus();
              else
                   new Exit();
       }

    public static void main(String args[])
    {
        new Home();
        
    }
}
