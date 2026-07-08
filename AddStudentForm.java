import javax.swing.*;
import java.awt.*;

public class AddStudentForm extends JFrame {

    JTextField rollField, nameField, ageField, genderField;
    JTextField courseField, phoneField, emailField, addressField;

    public AddStudentForm() {

        setTitle("Add Student");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(9, 2, 10, 10));

        add(new JLabel("Roll Number"));
        rollField = new JTextField();
        add(rollField);

        add(new JLabel("Name"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Gender"));
        genderField = new JTextField();
        add(genderField);

        add(new JLabel("Course"));
        courseField = new JTextField();
        add(courseField);

        add(new JLabel("Phone"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Email"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Address"));
        addressField = new JTextField();
        add(addressField);

        JButton saveButton = new JButton("Save");
        add(saveButton);

        saveButton.addActionListener(e -> {

            Student student = new Student(
                    rollField.getText(),
                    nameField.getText(),
                    Integer.parseInt(ageField.getText()),
                    genderField.getText(),
                    courseField.getText(),
                    phoneField.getText(),
                    emailField.getText(),
                    addressField.getText()
            );

            StudentDAO dao = new StudentDAO();
            dao.addStudent(student);

            JOptionPane.showMessageDialog(this, "Student Added Successfully!");

            dispose();

        });

        setVisible(true);
    }
}
