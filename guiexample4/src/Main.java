import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Cinsiyetiniz?");
        cerceve.setLayout(new FlowLayout());
        JRadioButton cb=new JRadioButton("Erkek");
        JRadioButton cb1=new JRadioButton("Kadın");
        cb1.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(cb);
        group.add(cb1);
        cerceve.add(cb);
        cerceve.add(cb1);
        cerceve.setVisible(true);
        cerceve.setSize(250,80);
        cerceve.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}