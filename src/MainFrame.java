import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Alura Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setResizable(false);

        setLayout(null);
        //JButton button1 = new JButton("Press"); //frame.getContentPane().add(button1);

        JLabel label = new JLabel("Seleccione una opcion de conversion:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(15,20,300,40);
        add(label);

        //ImageIcon image = new ImageIcon("alura.svg");
        getContentPane().setBackground(new Color( 0xD8DFE8));
        //this.setIconImage(image.getImage());

        /*CREATES A DROPDOWN MENU*/
        String[] options = {"Conversion de monedas", "Conversion de Temperatura"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        dropdown.setBounds(50,50,200,30);
        add(dropdown);

        //JTextField inputField = new JTextField();
        //inputField.setBounds(50,50,150,30);

        //add(inputField);

        setVisible(true);
    }
}
