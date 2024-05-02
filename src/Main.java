import javax.swing.*;
import java.awt.*;

class Mainframe extends JFrame{
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public Mainframe(){
        initialize();
    }
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("Action event");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        panel = new JPanel();
        label = new JLabel("enter your name");
        textField = new JTextField(20);
        button = new JButton("save");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    }
    public void show(){
        this.frame.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.show();
    }
}