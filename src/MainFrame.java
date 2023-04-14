import MoneyExchange.MoneyFrame;
import TemperatureConversion.TemperatureFrame;
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
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Selecione el tipo de conversion que desea: ");
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 0;
        panel.add(label,c);

        String[] options = {"Conversion de Monedas", "Conversion de Temperatura"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 1;

        dropdown.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        dropdown.setBackground(Color.WHITE);
        panel.add(dropdown, c);

        JButton button = new JButton("Siguiente");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new MoneyFrame();
                String selected = (String) dropdown.getSelectedItem();
                double result = 0;
                switch (selected){
                    case "Conversion de Monedas":
                        new MoneyFrame();
                        break;
                    case "Conversion de Temperatura":
                        new TemperatureFrame();
                        break;
                }
            }
        });
        c.gridx = 0;
        c.gridwidth = 3;
        c.gridy = 2;
        panel.add(button, c);

        //add(panel, BorderLayout.NORTH);
        add(panel);

        setVisible(true);
    }

}