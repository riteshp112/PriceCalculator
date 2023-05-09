import javax.swing.*;
import java.awt.*;

class About extends JFrame {
    JLabel j, j2;

    public About() {
        j = new JLabel(new ImageIcon("bk1.jpg"));
        j.setBounds(0, 0, 1200, 700);
        add(j);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        j2 = new JLabel(
                "<html>App : Price Calculator<br/>Version :1.0.0<br/>Delopers:The Fanatastic Fours Gaming World<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>(c)2019 The Fanatastic Fours Gaming World .All right reserved<html>");
        j2.setFont(new Font("Serif", Font.PLAIN, 30));
        j2.setForeground(Color.BLACK);
        j.add(j2);
        j.setLayout(new FlowLayout());
        setVisible(true);
        setSize(1700, 790);
    }

    public static void main(String args[]) {
        new About();
    }
}
