package MoneyExchange;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class MoneyFrame extends JFrame {
    public MoneyFrame(){
        setTitle("Cambio de moneda.");
        setSize(500,500);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Selecione la divisa");
        panel.add(label);



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