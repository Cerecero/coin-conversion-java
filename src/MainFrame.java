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

        JButton button = new JButton("Siguiente");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MoneyFrame();
            }
        });
        panel.add(button);

        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

}