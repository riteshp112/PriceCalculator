
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Price {
    JLabel bk;

    float r1, r2, qt1, qt2, tp, fp, top;
    JLabel l1, l2, l3, l12, l22;
    JFrame j;
    JComboBox c1, c2, c12, c22;
    JTextField tf, tf1;
    JTextArea ta, ta1;
    JButton b;
    JPanel p;

    Price() {
        System.out.flush();
        j = new JFrame();
        j.setTitle("Price Calculator");
        j.setSize(450, 600);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        j.setBackground(Color.blue);
        j.setResizable(false);
        j.setVisible(true);
        JLabel bk = new JLabel(new ImageIcon("bk4.jpg"));

        b = new JButton("Calculate Price");
        bk.add(b);
        b.setBounds(5, 400, 140, 50);
        b.repaint();

        ta = new JTextArea("Rs");
        ta.setEditable(false);
        bk.add(ta);
        ta.setBounds(165, 415, 40, 25);
        ta.repaint();

        String s1[] = { "Samsung", "Sony" };
        c1 = new JComboBox(s1);
        bk.add(c1);
        c1.setBounds(5, 60, 100, 50);
        c1.repaint();

        String s12[] = { "Samsung", "LG" };
        c12 = new JComboBox(s12);
        bk.add(c12);
        c12.setBounds(5, 230, 100, 50);
        c12.repaint();

        l1 = new JLabel("Television       ");
        bk.add(l1);
        l1.setBounds(5, 10, 100, 50);

        l2 = new JLabel("Size             ");
        bk.add(l2);
        l2.setBounds(140, 10, 100, 50);

        l3 = new JLabel("Quantity");
        bk.add(l3);
        l3.setBounds(260, 10, 100, 50);

        l12 = new JLabel("Fridge      ");
        bk.add(l12);
        l12.setBounds(5, 180, 100, 50);

        l22 = new JLabel("Liters             ");
        bk.add(l22);
        l22.setBounds(140, 180, 100, 50);
        l22.repaint();

        TextArea ta1 = new TextArea();
        bk.add(ta1);
        ta1.setBounds(250, 400, 100, 50);
        ta1.setEditable(false);
        ta1.repaint();

        String s22[] = { "192", "253" };
        JComboBox c22 = new JComboBox(s22);
        c22.setBounds(125, 230, 100, 50);
        bk.add(c22);
        c22.repaint();

        String s2[] = { "32 inch", "43 inch" };
        JComboBox c2 = new JComboBox(s2);
        c2.setBounds(125, 60, 100, 50);
        bk.add(c2);
        c2.repaint();

        JTextField tf1 = new JTextField(10);
        bk.add(tf1);
        tf1.setBounds(245, 230, 100, 50);
        tf1.repaint();
        JTextField tf = new JTextField(10);
        bk.add(tf);
        tf.setBounds(245, 60, 100, 50);
        tf.repaint();
        j.add(bk);
        j.setSize(449, 599);
        j.setSize(450, 600);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    if (c1.getSelectedItem().equals("Samsung")) {
                        if (c2.getSelectedItem().equals("32 inch"))
                            r1 = 30299;
                        else
                            r1 = 39999;
                    } else {
                        if (c2.getSelectedItem().equals("32 inch"))
                            r1 = 32299;
                        else
                            r1 = 44890;
                    }
                    if (c12.getSelectedItem().equals("Samsung")) {
                        if (c22.getSelectedItem().equals("192"))
                            r2 = 16490;
                        else
                            r2 = 23490;
                    } else {
                        if (c22.getSelectedItem().equals("192"))
                            r2 = 14490;
                        else
                            r2 = 23490;
                    }
                    qt1 = Float.parseFloat(tf.getText());
                    qt2 = Float.parseFloat(tf1.getText());
                    tp = r1 * qt1;
                    fp = r2 * qt2;
                    top = tp + fp;
                    ta1.setText(" " + top);
                }
            }
        });
    }

    public static void main(String args[]) {
        new Price();
    }
}
