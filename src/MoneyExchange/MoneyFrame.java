package MoneyExchange;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class MoneyFrame extends JFrame {
    public MoneyFrame(){
        setTitle("Conversion de Monedas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setResizable(false);

        JPanel panel = new JPanel();
        add(panel);

        setVisible(true);

    }
}
