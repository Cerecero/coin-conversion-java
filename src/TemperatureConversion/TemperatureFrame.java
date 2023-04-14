package TemperatureConversion;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class TemperatureFrame extends JFrame {

    private final Temperature tempConversion = new Temperature();
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
                String input = inputCelsius.getText();
                double temperature = Double.parseDouble(input);
                double TempKelvin = tempConversion.CelsiustoKelvin(temperature);
                double TempFahrenheit = tempConversion.CelsiustoFahrenheit(temperature);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputKelvin.setText(TempKelvin+ "°");
                    inputFarenheit.setText(TempFahrenheit+"°");
                }
            }
        });
        inputFarenheit.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                String input = inputFarenheit.getText();
                double temperature = Double.parseDouble(input);
                double TempKelvin = tempConversion.FahrenheittoKelvin(temperature);
                double TempCelsius = tempConversion.FahrenheittoCelsius(temperature);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputKelvin.setText(TempKelvin+ "°");
                    inputCelsius.setText(TempCelsius+"°");
                }
            }
        });
        inputKelvin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                String input = inputKelvin.getText();
                double temperature = Double.parseDouble(input);
                double TempFahrenheit = tempConversion.KelvintoFahrenheit(temperature);
                double TempCelsius = tempConversion.KelvintoCelsius(temperature);

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    inputFarenheit.setText(TempFahrenheit+ "°");
                    inputCelsius.setText(TempCelsius+"°");
                }
            }
        });
        inputCelsius.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e){
                inputKelvin.setText("");
                inputFarenheit.setText("");
            }
        });

        add(panel, BorderLayout.NORTH);

        setVisible(true);

    }
}
