package MoneyExchange;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class MoneyFrame extends JFrame {
    public MoneyFrame(){
        setTitle("Cambio de moneda.");
        setSize(500,500);
        setLayout(new GridLayout(3 , 1 , 0, 0));
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Selecione la divisa");
        panel.add(label);

        String[] options = {"De MXN a USD","De MXN a EURO","De MXN a YEN","De MXN a AUD","De MXN a CAD","De MXN a CHF","De MXN a CNH","De MXN a HKD","De MXN a NZD", "De USD a MXN","De EURO a MXN","De YEN a MXN","De AUD a MXN","De CAD a MXN","De USD a CHF","De CNH a MXN","De HKD a MXN","De NZD a MXN"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) dropdown.getSelectedItem();
            }
        });
        panel.add(dropdown);

        JLabel labelAmount = new JLabel("Ingrese la cantidad a convertir: ");
        panel.add(labelAmount);

        JTextField textField = new JTextField(1);
        //textField.setBorder(new EmptyBorder(new Insets(0,210,10,10)));
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String input = textField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String input = textField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String input = textField.getText();
            }
        });
        panel.add(textField);

        JButton exchange = new JButton();

        add(panel);
        setVisible(true);

    }

}

/*public MoneyFrame(){
        setTitle("Conversion de Monedas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setResizable(false);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        add(panel);

        NumberFormat input = NumberFormat.getNumberInstance();
        JFormattedTextField textField = new JFormattedTextField(input);

        textField.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        panel.add(textField);

        setVisible(true);

    }*/