package TemperatureConversion;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TemperatureFrame extends JFrame {
    public TemperatureFrame() {
        setTitle("Cambio de Temperatura");
        setSize(500,500);
        setLayout(new GridLayout(3 , 1 , 0, 0));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField inputCelsius = new JTextField();
        JTextField inputFarenheit = new JTextField();
        JTextField inputKelvin = new JTextField();

        panel.add(inputCelsius);
        panel.add(inputFarenheit);
        panel.add(inputKelvin);

        inputCelsius.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputKelvin.setText("test");
                }
            }
        });

        add(panel, BorderLayout.NORTH);

        setVisible(true);

    }
}
