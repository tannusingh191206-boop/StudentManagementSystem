import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ViewStudentsForm extends JFrame {

    JTable table;
    DefaultTableModel model;

    public ViewStudentsForm() {

        setTitle("View Students");
        setSize(900, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        model = new DefaultTableModel();

        model.addColumn("Roll No");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Gender");
        model.addColumn("Course");
        model.addColumn("Phone");
        model.addColumn("Email");
        model.addColumn("Address");

        table = new JTable(model);

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM students";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                model.addRow(new Object[]{
                        rs.getString("rollNo"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("course"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("address")
                });

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }
}
