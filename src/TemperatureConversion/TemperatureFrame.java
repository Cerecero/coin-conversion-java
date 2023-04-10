package TemperatureConversion;

import javax.swing.*;
import java.awt.*;

public class TemperatureFrame extends JFrame {
    public TemperatureFrame() {
        setTitle("Cambio de Temperatura");
        setSize(500,500);
        setLayout(new GridLayout(3 , 1 , 0, 0));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setVisible(true);

    }
}
