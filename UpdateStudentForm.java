import javax.swing.*;
import java.awt.*;

public class UpdateStudentForm extends JFrame {

    JTextField rollField, phoneField, emailField;

    public UpdateStudentForm() {

        setTitle("Update Student");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Roll Number"));
        rollField = new JTextField();
        add(rollField);

        add(new JLabel("New Phone"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("New Email"));
        emailField = new JTextField();
        add(emailField);

        JButton updateButton = new JButton("Update");
        add(updateButton);

        updateButton.addActionListener(e -> {

            StudentDAO dao = new StudentDAO();

            dao.updateStudent(
                    rollField.getText(),
                    phoneField.getText(),
                    emailField.getText()
            );

            JOptionPane.showMessageDialog(this, "Student Updated Successfully!");

            dispose();

        });

        setVisible(true);
    }
}