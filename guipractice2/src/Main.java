import java.awt.GridLayout;
import javax.swing.*;
class sifre extends JPanel{
    public static void main(String[] args) {
    JTextField password, username;
    password = new JTextField(15);
    username = new JTextField(15);
    JFrame Cerceve=new JFrame("Sifre Ekrani");
    Cerceve.setLayout(new GridLayout(2,2));
    Cerceve.add(new JLabel("Password"));
    Cerceve.add(password);
    Cerceve.add(new JLabel("Username"));
    Cerceve.add(username);
    Cerceve.setSize(300,200);
    Cerceve.setVisible(true);
    Cerceve.pack();
    }
}