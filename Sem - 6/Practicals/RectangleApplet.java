/*<body>
    <applet code="RectangleApplet.class" height="500" width="500"></applet>
</body> */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RectangleApplet extends Applet implements ActionListener {
    TextField widthTextField, heightTextField;
    Button drawButton;
    int width, height;

    public void init() {
        // Create the UI components
        widthTextField = new TextField(5);
        heightTextField = new TextField(5);
        drawButton = new Button("Draw Rectangle");

        // Add the components to the applet
        add(new Label("Width:"));
        add(widthTextField);
        add(new Label("Height:"));
        add(heightTextField);
        add(drawButton);

        // Register the button click listener
        drawButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Parse the user input and set the width and height variables
        width = Integer.parseInt(widthTextField.getText());
        height = Integer.parseInt(heightTextField.getText());

        // Force the applet to repaint itself
        repaint();
    }

    public void paint(Graphics g) {
        // Draw the rectangle using the user input
        g.drawRect(50, 50, width, height);
    }
}