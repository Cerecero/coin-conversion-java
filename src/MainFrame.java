import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Alura Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setResizable(false);

        JPanel MainPanel = new JPanel();
        MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
        add(MainPanel);

        JLabel label = new JLabel("Seleccione una opcion de conversion:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(15,20,30,40);
        MainPanel.add(label);

        getContentPane().setBackground(new Color( 0xD8DFE8)); //Sets the background color

        /*CREATES A DROPDOWN MENU*/
        String[] options = {"Conversion de monedas", "Conversion de Temperatura"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        dropdown.setBounds(50,50,10,30);
        MainPanel.add(dropdown);

        JButton button = new JButton("Next");
        button.setBounds(100,50, 50, 20);
        MainPanel.add(button);

        setVisible(true);
    }
}
