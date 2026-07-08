import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class SearchStudentForm extends JFrame {

    JTextField rollField;
    JTextArea resultArea;

    public SearchStudentForm() {

        setTitle("Search Student");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        topPanel.add(new JLabel("Roll Number:"));

        rollField = new JTextField(15);
        topPanel.add(rollField);

        JButton searchButton = new JButton("Search");
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);

        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        searchButton.addActionListener(e -> {

            try {

                Connection con = DBConnection.getConnection();

                String sql = "SELECT * FROM students WHERE rollNo=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, rollField.getText());

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    resultArea.setText(
                            "Roll No : " + rs.getString("rollNo") +
                            "\nName : " + rs.getString("name") +
                            "\nAge : " + rs.getInt("age") +
                            "\nGender : " + rs.getString("gender") +
                            "\nCourse : " + rs.getString("course") +
                            "\nPhone : " + rs.getString("phone") +
                            "\nEmail : " + rs.getString("email") +
                            "\nAddress : " + rs.getString("address")
                    );

                } else {

                    resultArea.setText("Student Not Found!");

                }

                con.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });

        setVisible(true);
    }
}