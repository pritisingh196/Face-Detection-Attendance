package Face.Detection.Attendance.Face.Detection.Attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHelper {
	String url = "jdbc:mysql://localhost:3306/face_detector";
	String user = "root"; 
	String password = "root";


    public void saveFace(String name, String imagePath) {
        String sql = "INSERT INTO faces (name, image_path) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // Set parameters
            pstmt.setString(1, name);
            pstmt.setString(2, imagePath);

            // Execute the insert
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Face details saved successfully.");
            } else {
                System.out.println("Failed to save face details.");
            }

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}