import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String ad;
        ad= JOptionPane.showInputDialog(null,"Adinizi giriniz:");
        JFrame frame = new JFrame("Ad Gir:");
        frame.setSize(300,100);
        Label lbl1 = new Label(ad);
        frame.add(lbl1);
        frame.pack();
        frame.setVisible(true);
    }
}