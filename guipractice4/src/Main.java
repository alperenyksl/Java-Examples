import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("İlk pencerem");
        jframe.setSize(500, 500);
        jframe.setTitle("İlk pencerem");
        jframe.setLocation(100, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);

        JLabel label = new JLabel();
        label.setText("merabalarr");

        JPanel panel = new JPanel();
        JTextField jtextfield = new JTextField(10);
        JButton jbutton = new JButton("Gönder");
        JButton jbutton2 = new JButton("Tıkla");
        JButton jbutton3 = new JButton("Bilgi al");

        panel.add(label);
        panel.add(jtextfield);
        panel.add(jbutton);
        panel.add(jbutton2); // jbutton2'yi panele ekliyoruz
        panel.add(jbutton3);
        jframe.add(panel);
        jframe.setVisible(true);

        jbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("merabalarr " + jtextfield.getText() + " programa hosgeldin.");
            }
        });

        jbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Merhabalar panele hosgeldiniz.");
            }
        });
        jbutton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim= JOptionPane.showInputDialog("Lütfen isminizi giriniz:");
                JOptionPane.showMessageDialog(null, "Hosgeldin "+isim);
            }
        });
    }
}
