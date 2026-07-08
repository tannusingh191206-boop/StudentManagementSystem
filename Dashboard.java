import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Student Management System");
        setSize(650, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Background Color
        getContentPane().setBackground(new Color(230, 240, 255));

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(230, 240, 255));
        mainPanel.setLayout(new BorderLayout());

        // ================= TITLE =================
        JLabel title = new JLabel("🎓 STUDENT MANAGEMENT SYSTEM");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(new Color(25, 25, 112));

        mainPanel.add(title, BorderLayout.NORTH);

        // ================= CENTER PANEL =================
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 240, 255));
        buttonPanel.setLayout(new GridLayout(6, 1, 15, 15));

        JButton addButton = new JButton("➕ Add Student");
        JButton viewButton = new JButton("📋 View Students");
        JButton searchButton = new JButton("🔍 Search Student");
        JButton updateButton = new JButton("✏️ Update Student");
        JButton deleteButton = new JButton("🗑️ Delete Student");
        JButton exitButton = new JButton("🚪 Exit");

        Font btnFont = new Font("Segoe UI", Font.BOLD, 18);

        JButton[] buttons = {
                addButton,
                viewButton,
                searchButton,
                updateButton,
                deleteButton,
                exitButton
        };

        for (JButton b : buttons) {
            b.setFont(btnFont);
            b.setFocusPainted(false);
        }

        // Button Colors
        addButton.setBackground(new Color(52, 152, 219));
        addButton.setForeground(Color.WHITE);

        viewButton.setBackground(new Color(46, 204, 113));
        viewButton.setForeground(Color.WHITE);

        searchButton.setBackground(new Color(241, 196, 15));
        searchButton.setForeground(Color.BLACK);

        updateButton.setBackground(new Color(155, 89, 182));
        updateButton.setForeground(Color.WHITE);

        deleteButton.setBackground(new Color(231, 76, 60));
        deleteButton.setForeground(Color.WHITE);

        exitButton.setBackground(Color.DARK_GRAY);
        exitButton.setForeground(Color.WHITE);

        // Action Listeners
        addButton.addActionListener(e -> new AddStudentForm());
        viewButton.addActionListener(e -> new ViewStudentsForm());
        searchButton.addActionListener(e -> new SearchStudentForm());
        updateButton.addActionListener(e -> new UpdateStudentForm());
        deleteButton.addActionListener(e -> new DeleteStudentForm());
        exitButton.addActionListener(e -> System.exit(0));

        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(exitButton);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // ================= FOOTER =================
        JLabel footer = new JLabel("© 2026 Student Management System");
        footer.setHorizontalAlignment(SwingConstants.CENTER);
        footer.setForeground(Color.GRAY);

        mainPanel.add(footer, BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
    }
}