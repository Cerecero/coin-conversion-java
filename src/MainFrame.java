import MoneyExchange.MoneyFrame;
import com.sun.tools.javac.Main;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("MainFrame");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Selecione el tipo de conversion que desea: ");

        panel.add(label);

        String[] options = {"Conversion de Monedas", "Conversion de Temperatura"};
        JComboBox<String> dropdown = new JComboBox<>(options);

        dropdown.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        dropdown.setBackground(Color.WHITE);
        panel.add(dropdown);

        JButton button = new JButton("Click Me");
        panel.add(button);

        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

}

/*public MainFrame(){
        setTitle("Alura Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setResizable(false);

        JPanel MainPanel = new JPanel();
        //MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.Y_AXIS));
        MainPanel.setLayout(new FlowLayout());
        add(MainPanel);

        JLabel label = new JLabel("Seleccione una opcion de conversion:");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(15,20,30,40);
        MainPanel.add(label);

        /*CREATES A DROPDOWN MENU*/
/*String[] options = {"Conversion de monedas", "Conversion de Temperatura"};
    JComboBox<String> dropdown = new JComboBox<>(options);
        dropdown.setBounds(50,50,10,30);
                MainPanel.add(dropdown);

                //getContentPane().setBackground(new Color( 0xD8DFE8)); //Sets the background color


                //CREATE A BUTTON
                JButton button = new JButton("Next");
                button.setBounds(50,50, 50, 20);
                button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        String selection = (String) dropdown.getSelectedItem();
        if (selection.equals("Conversion de monedas")) {
        MoneyFrame money = new MoneyFrame();
        money.setVisible(true);
        } else if (selection.equals("Conversion de Temperatura")){

        }
        }
        });
        MainPanel.add(button);

        setVisible(true);
        }*/