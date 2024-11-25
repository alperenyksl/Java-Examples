import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame Cerceve = new JFrame("Kacinci sinifsin");
        Cerceve.setLayout(new FlowLayout());
        Cerceve.setSize(300, 300);
        JButton b1=new JButton("1.sinif");
        JButton b2=new JButton("2.sinif");
        JButton b3=new JButton("3.sinif");
        JButton b4=new JButton("4.sinif");
        Cerceve.add(b1);
        Cerceve.add(b2);
        Cerceve.add(b3);
        Cerceve.add(b4);
        Cerceve.setVisible(true);
        Cerceve.pack();
    }
}