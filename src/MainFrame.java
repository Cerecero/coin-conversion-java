import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setResizable(false);
        //JButton button1 = new JButton("Press"); //frame.getContentPane().add(button1);

        ImageIcon image = new ImageIcon("alura.svg");
        frame.getContentPane().setBackground(new Color( 0xD8DFE8));
        frame.setIconImage(image.getImage());
    }
}
