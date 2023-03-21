import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Alura Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setResizable(false);
        //JButton button1 = new JButton("Press"); //frame.getContentPane().add(button1);

        ImageIcon image = new ImageIcon("alura.svg");
        this.getContentPane().setBackground(new Color( 0xD8DFE8));
        this.setIconImage(image.getImage());

        JTextField inputField = new JTextField();
        inputField.setBounds(50,50,150,30);

        add(inputField);

        setVisible(true);
    }
}
