package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetails {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Details");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.setLayout(new GridLayout(5, 2));

        Label idLabel = new Label("Student ID:");
        TextField idField = new TextField();
        
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label genderLabel = new Label("Gender:");
        String[] genders = { "Male", "Female", "Other" };
        JComboBox<String> genderCombo = new JComboBox<>(genders);
        
        Button submitButton = new Button("Submit");
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String age = ageField.getText();
                String gender = (String) genderCombo.getSelectedItem();

                String output = String.format("Student ID: %s\nName: %s\nAge: %s\nGender: %s\n",
                        id, name, age, gender);
                outputArea.setText(output);
            }
        });

        f.add(idLabel);
        f.add(idField);
        f.add(nameLabel);
        f.add(nameField);
        f.add(ageLabel);
        f.add(ageField);
        f.add(genderLabel);
        f.add(genderCombo);
        f.add(submitButton);
        f.add(outputArea);
        
        f.setVisible(true);
    }
}
