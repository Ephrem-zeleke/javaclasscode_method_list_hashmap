package week9.hello_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// intellij created the hello_GUI components and we need to tell hello GUI that it is a j frame
public class hello_GUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;


    // now we can add the constructor

    hello_GUI(){
        // do some staffs
        // let set the content pane
        setContentPane(mainPanel); // this set content panel will take one argument and it is a main panel
        // the main panel contain all the components
        setPreferredSize(new Dimension(500, 500));
        pack();// call a method call pack, and it will pack all the components with all the right sizes
        setVisible(true);// make sure we can see the gui. by default jframe is not visible
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // if we need something to happen when we press the button, we have to add an event handler

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // action will go here and we can write the code here
                myFirstLabel.setText("Hello GUI programmers!!!");
            }
        });


    }
}
