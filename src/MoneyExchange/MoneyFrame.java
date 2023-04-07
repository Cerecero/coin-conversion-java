package MoneyExchange;

import javax.sql.XADataSource;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class MoneyFrame extends JFrame {
    private MoneyExchange moneyExchange = new MoneyExchange();
    private ForeignExchangeToLocal foreignExchange = new ForeignExchangeToLocal();
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

        JButton exchange = new JButton("Cambio");
        exchange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String selected = (String) dropdown.getSelectedItem();
                double amount = Double.parseDouble(input);
                double result = 0;

                switch (selected) {
                    case "De MXN a USD":
                        result = foreignExchange.ExchangeMXNtoUSD(amount);
                        break;
                    case "De MXN a EURO":
                        result = foreignExchange.ExchangeMXNtoEURO(amount);
                        break;
                    case "De MXN a YEN":
                        result = foreignExchange.ExchangeMXNtoYEN(amount);
                        break;
                    case "De MXN a AUD":
                        result = foreignExchange.ExchangeMXNtoAUD(amount);
                        break;
                    case "De MXN a CAD":
                        result = foreignExchange.ExchangeMXNtoCAD(amount);
                        break;
                    case "De MXN a CHF":
                        result = foreignExchange.ExchangeMXNtoCHF(amount);
                        break;
                    case "De MXN a CNH":
                        result = foreignExchange.ExchangeMXNtoCNH(amount);
                        break;
                    case "De MXN a HKD":
                        result = foreignExchange.ExchangeMXNtoHKD(amount);
                        break;
                    case "De MXN a NZD":
                        result = foreignExchange.ExchangeMXNtoNZD(amount);
                        break;
                    case "De USD a MXN":
                        result = moneyExchange.ExchangeUSDtoMXN(amount);
                        break;
                    case "De EURO a MXN":
                        result = moneyExchange.ExchangeEUROtoMXN(amount);
                        break;
                    case "De YEN a MXN":
                        result = moneyExchange.ExchangeYENtoMXN(amount);
                        break;
                    case "De AUD a MXN":
                        result = moneyExchange.ExchangeAUDtoMXN(amount);
                        break;
                    case "De CAD a MXN":
                        result = moneyExchange.ExchangeCADtoMXN(amount);
                        break;
                    case "De CHF a MXN":
                        result = moneyExchange.ExchangeCHFtoMXN(amount);
                        break;
                    case "De CNH a MXN":
                        result = moneyExchange.ExchangeCNHtoMXN(amount);
                        break;
                    case "De HKD a MXN":
                        result = moneyExchange.ExchangeHKDtoMXN(amount);
                        break;
                    case "De NZD a MXN":
                        result = moneyExchange.ExchangeNZDtoMXN(amount);
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
                /*if (selected.equals("De MXN a USD")) {
                    result = foreignExchange.ExchangeMXNtoUSD(amount);
                } else if (selected.equals("De MXN a EURO")) {
                    result = foreignExchange.ExchangeMXNtoEURO(amount);
                } else if (selected.equals("De MXN a YEN")) {
                    result = foreignExchange.ExchangeMXNtoYEN(amount);
                } else if (selected.equals("De MXN a AUD")) {
                    result = foreignExchange.ExchangeMXNtoAUD(amount);
                } else if (selected.equals("De MXN a CAD")) {
                    result = foreignExchange.ExchangeMXNtoCAD(amount);
                } else if (selected.equals("De MXN a CHF")) {
                    result = foreignExchange.ExchangeMXNtoCHF(amount);
                } else if (selected.equals("De MXN a CNH")) {
                    result = foreignExchange.ExchangeMXNtoCNH(amount);
                } else if (selected.equals("De MXN a HKD")) {
                    result = foreignExchange.ExchangeMXNtoHKD(amount);
                } else if (selected.equals("De MXN a NZD")) {
                    result = foreignExchange.ExchangeMXNtoNZD(amount);
                } else if (selected.equals("De USD a MXN")) {
                    result = moneyExchange.ExchangeUSDtoMXN(amount);
                } else if (selected.equals("De EURO a MXN")) {
                    result = moneyExchange.ExchangeEUROtoMXN(amount);
                } else if (selected.equals("De YEN a MXN")) {
                    result = moneyExchange.ExchangeYENtoMXN(amount);
                } else if (selected.equals("De AUD a MXN")) {
                    result = moneyExchange.ExchangeAUDtoMXN(amount);
                } else if (selected.equals("De CAD a MXN")) {
                    result = moneyExchange.ExchangeCADtoMXN(amount);
                } else if (selected.equals("De CHF a MXN")) {
                    result = moneyExchange.ExchangeCHFtoMXN(amount);
                } else if (selected.equals("De CNH a MXN")) {
                    result = moneyExchange.ExchangeCNHtoMXN(amount);
                } else if (selected.equals("De HKD a MXN")) {
                    result = moneyExchange.ExchangeHKDtoMXN(amount);
                } else if (selected.equals("De NZD a MXN")) {
                    result = moneyExchange.ExchangeNZDtoMXN(amount);
                }*/

                JFrame resultFrame = new JFrame();
                JLabel resultLabel = new JLabel(String.format("%.2f", result));
                resultFrame.add(resultLabel);
                resultFrame.pack();
                resultFrame.setVisible(true);
            }
        });
        panel.add(exchange);

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