import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Alura Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setResizable(false);

        setLayout(null);

        JLabel label = new JLabel("Seleccione una opcion de conversion:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(15,20,300,40);
        add(label);

        getContentPane().setBackground(new Color( 0xD8DFE8));

        /*CREATES A DROPDOWN MENU*/
        String[] options = {"Conversion de monedas", "Conversion de Temperatura"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        dropdown.setBounds(50,50,200,30);
        add(dropdown);

        setVisible(true);
    }
}
