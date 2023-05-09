import java.awt.*;
import java.awt.event.*;

public class StudentDetailsForm extends Frame {
    Label nameLabel, ageLabel, gradeLabel;
    TextField nameField, ageField, gradeField;
    Button submitButton;

    public StudentDetailsForm() {
        // Set the title of the window
        setTitle("Student Details Form");
        
        // Create labels and text fields for name, age, and grade
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        gradeLabel = new Label("Grade:");
        nameField = new TextField(10);
        ageField = new TextField(10);
        gradeField = new TextField(10);

        // Create a submit button
        submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle form submission
                String name = nameField.getText();
                String age = ageField.getText();
                String grade = gradeField.getText();
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Grade: " + grade);
            }
        });

        // Add the controls to the window
        setLayout(new FlowLayout());
        Component[] comp = {nameLabel, nameField,ageLabel, ageField, gradeLabel,gradeField,submitButton};
        for(Component item : comp){
            add(item);
        }

        // Set the size of the window and make it visible
        setSize(400, 200);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new StudentDetailsForm();
    }
}