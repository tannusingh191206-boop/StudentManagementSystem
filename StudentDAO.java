import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

    public void addStudent(Student student) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO students(rollNo, name, age, gender, course, phone, email, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getRollNo());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getGender());
            ps.setString(5, student.getCourse());
            ps.setString(6, student.getPhone());
            ps.setString(7, student.getEmail());
            ps.setString(8, student.getAddress());

            ps.executeUpdate();

            System.out.println("Student Added Successfully!");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void viewStudents() {

    try {

        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM students");

        System.out.println("\n========== STUDENT LIST ==========");

        while (rs.next()) {

            System.out.println("-------------------------------");
            System.out.println("ID      : " + rs.getInt("id"));
            System.out.println("Roll No : " + rs.getString("rollNo"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Age     : " + rs.getInt("age"));
            System.out.println("Gender  : " + rs.getString("gender"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Phone   : " + rs.getString("phone"));
            System.out.println("Email   : " + rs.getString("email"));
            System.out.println("Address : " + rs.getString("address"));
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void searchStudent(String rollNo) {

    try {

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM students WHERE rollNo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, rollNo);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println("\n===== STUDENT FOUND =====");

            System.out.println("ID      : " + rs.getInt("id"));
            System.out.println("Roll No : " + rs.getString("rollNo"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Age     : " + rs.getInt("age"));
            System.out.println("Gender  : " + rs.getString("gender"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Phone   : " + rs.getString("phone"));
            System.out.println("Email   : " + rs.getString("email"));
            System.out.println("Address : " + rs.getString("address"));

        } else {

            System.out.println("Student Not Found.");

        }

        con.close();

    } catch (Exception e) {

        e.printStackTrace();

    }
}
public void updateStudent(String rollNo, String newPhone, String newEmail) {

    try {

        Connection con = DBConnection.getConnection();

        String sql = "UPDATE students SET phone = ?, email = ? WHERE rollNo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, newPhone);
        ps.setString(2, newEmail);
        ps.setString(3, rollNo);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void deleteStudent(String rollNo) {

    try {

        Connection con = DBConnection.getConnection();

        String sql = "DELETE FROM students WHERE rollNo = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, rollNo);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}