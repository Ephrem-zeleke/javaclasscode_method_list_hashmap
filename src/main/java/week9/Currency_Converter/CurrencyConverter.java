package week9.Currency_Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{

    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox;

    //private double dollarToEuroExchageRate = 0.84;
    // since the variables are not going to change, we can make them final
    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";

    // we can create a hashmap that contain both the euros and pounds and its exchange rate

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter(){
        // now we can add the constructor and do the setup tasks
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // this will close the operation

        // if we want our convert button respond to enter, we can add the following code
        getRootPane().setDefaultButton(convertButton);

        // we can setup our combo box

        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);

        // now we need an event handler because when we click the convert button, we need the converter button to do something
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // what was write on the jtext field is a string
                String dollarString = dollarsTextField.getText();
                // we need to convert the string to number
                // we have to have an exception handling code if the user put other character other than number
                // we can surround our code with the try and catch block

                try {
                    double dollars = Double.parseDouble(dollarString);

                    // lets get the selected item from the combo box

                    String toCurrency = (String) currencyComboBox.getSelectedItem();

                    // now we can get the exchange rate from the hashmap

                    double exchangeRate = exchangeRates.get(toCurrency);

                    // now we can do the math

                    double convertedValue = dollars * exchangeRate;
                    // now we can pass the result to the euroResult label

                    String resultString = String.format("%.2f dollar is equivalent to %.2f %s", dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
                }catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without $ or any other character");
                }

            }
        });
    }
}
