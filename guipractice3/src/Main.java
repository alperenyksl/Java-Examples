import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    static JFrame f;
    static JTextField tf;
    static JLabel l; // JLabel bileşeni eklendi
    String s0, s1, s2;

    Calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        f = new JFrame("Calculator");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Calculator cal = new Calculator();
        tf = new JTextField(16);
        tf.setEditable(false);
        l = new JLabel(); // Sonucu göstermek için JLabel eklendi

        // Düğmeler oluşturuluyor
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton beq1 = new JButton("=");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton beq = new JButton("C");
        JButton be = new JButton(".");

        // Düğmelere action listener ekleniyor
        bm.addActionListener(cal);
        bd.addActionListener(cal);
        bs.addActionListener(cal);
        ba.addActionListener(cal);
        b9.addActionListener(cal);
        b8.addActionListener(cal);
        b7.addActionListener(cal);
        b6.addActionListener(cal);
        b5.addActionListener(cal);
        b4.addActionListener(cal);
        b3.addActionListener(cal);
        b2.addActionListener(cal);
        b1.addActionListener(cal);
        b0.addActionListener(cal);
        be.addActionListener(cal);
        beq.addActionListener(cal);
        beq1.addActionListener(cal);

        // Panel oluşturuluyor ve bileşenler ekleniyor
        JPanel p1 = new JPanel();
        p1.add(tf);
        p1.add(l); // JLabel, panelin üst kısmına eklendi
        p1.add(ba);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(bs);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(bm);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(bd);
        p1.add(be);
        p1.add(b0);
        p1.add(beq);
        p1.add(beq1);
        p1.setBackground(Color.blue);

        f.add(p1);
        f.setSize(200, 300);
        f.setVisible(true); // setVisible kullanıldı

    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // Sayı ya da ondalık noktayı al
            if (!s1.equals("")) {
                s2 = s2 + s;
            } else {
                s0 = s0 + s;
            }
            tf.setText(s0 + s1 + s2);
        } else if (s.equals("C")) {
            // Temizle butonu
            s0 = s1 = s2 = "";
            tf.setText("");
            l.setText("");
        } else if (s.equals("=")) {
            // Eşittir butonu, sonucu hesapla
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            tf.setText(s0 + s1 + s2 + "=" + te);
            l.setText("Sonuç: " + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        } else {
            // İşlem operatörlerini ayarla
            if (s1.equals("") || s2.equals("")) {
                s1 = s;
            } else {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            tf.setText(s0 + s1 + s2);
        }
    }
}
