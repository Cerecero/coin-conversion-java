import MoneyExchange.MoneyFrame;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    MainFrame(){
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
        String[] options = {"Conversion de monedas", "Conversion de Temperatura"};
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
                    MoneyFrame money = new MoneyFrame();g
                } else if (selection.equals("Conversion de Temperatura")){

                }
            }
        });
        MainPanel.add(button);

        setVisible(true);
    }
}
