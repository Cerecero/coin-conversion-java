import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        this.setTitle("Alura Challenge");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,400);
        this.setResizable(false);
        //JButton button1 = new JButton("Press"); //frame.getContentPane().add(button1);

        ImageIcon image = new ImageIcon("alura.svg");
        this.getContentPane().setBackground(new Color( 0xD8DFE8));
        this.setIconImage(image.getImage());
        this.setVisible(true);
    }
}
