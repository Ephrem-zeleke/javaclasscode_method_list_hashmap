package week9.Movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGui extends JFrame{
    private JTextField movieTitleTextField;
    private JCheckBox wouldSeeAgainCheckBox;
    private JSlider ratingSlider;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    // let set the constructor

    MovieGui(){
        // set the main panel

        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // now we can write our event handler. instead of writing the event handler here, let's organize with a method

        configureEventHandler();
        // we can create the configure event handler method inside the MovieGui class



    }

    private void configureEventHandler(){

        // this method will organize the event handler
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // we can add event handler for the slider value label
                String valueLabelText = ratingSlider.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();


            }
        });
        wouldSeeAgainCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOpinion();
            }
        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }
    private void updateOpinion(){
        // see method will see what value the rating slide has, will also see what the checkbox has and it also see the
        //value of the movie opinion level
        String movieName = movieTitleTextField.getText();
        int rating = ratingSlider.getValue();
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();

        // now we can write a template string

        String template = "You rate %s %d stars. you %s see again";
        // assign a variable for would see or would not see

        String seeAgainString = "Would";

        if (!seeAgain){
            seeAgainString = "Would not";
        }

        String opinion = String.format(template, movieName, rating, seeAgainString );

        movieOpinionLabel.setText(opinion);



    }


}
