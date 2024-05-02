import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Mainframe implements ActionListener{
    //for second way we can implement Actionlistener to our mainframe
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
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        panel = new JPanel();
        label = new JLabel("enter your name");
        textField = new JTextField(20);
        button = new JButton("save");

        //first method for adding action listener:
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });*/

        button.addActionListener(this);

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    }
    public void show(){
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String enter_text = textField.getText();
        System.out.println(enter_text);
    }
}

public class Main {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.show();
    }
}