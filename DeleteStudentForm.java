import javax.swing.*;
import java.awt.*;

public class DeleteStudentForm extends JFrame {

    JTextField rollField;

    public DeleteStudentForm() {

        setTitle("Delete Student");
        setSize(350, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(2, 2, 10, 10));

        add(new JLabel("Roll Number"));
        rollField = new JTextField();
        add(rollField);

        JButton deleteButton = new JButton("Delete");
        add(deleteButton);

        deleteButton.addActionListener(e -> {

            StudentDAO dao = new StudentDAO();

            dao.deleteStudent(rollField.getText());

            JOptionPane.showMessageDialog(this, "Student Deleted Successfully!");

            dispose();

        });

        setVisible(true);
    }
}
