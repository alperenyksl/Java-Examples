import javax.swing.*;
import java.awt.*;

public static void main(String[] args) {
    JFrame frame = new JFrame("Otomobil özellikleri");
    frame.setLayout(new FlowLayout());
    JCheckBox checkBox = new JCheckBox("ABS");
    frame.add(checkBox);
    JCheckBox checkBox2 = new JCheckBox("CD calar");
    frame.add(checkBox2);
    JCheckBox checkBox3 = new JCheckBox("Hava yastigi");
    frame.add(checkBox3);
    JCheckBox checkBox4 = new JCheckBox("Klima");
    frame.add(checkBox4);
    checkBox4.setSelected(true);
    frame.pack();
    frame.setVisible(true);
}