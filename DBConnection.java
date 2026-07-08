import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        String url = "jdbc:mysql://127.0.0.1:3306/studentdb";
        String user = "root";
        String password = "reena@2026";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected Successfully!");

            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}