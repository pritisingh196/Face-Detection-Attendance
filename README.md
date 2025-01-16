# Face Detection Attendance System

This project is a Face Detection Attendance System that automatically tracks attendance using facial recognition technology. The system identifies faces from an image or video and records the attendance of individuals in a database. The objective is to simplify the attendance process, eliminate human errors, and prevent proxy attendance.

---

## **Features**

- **Face Detection**: Automatically detects faces from an image or video.
- **Attendance Management**: Records the name of the detected individual and logs their attendance in a MySQL database.
- **Database Integration**: Stores attendance data in a relational database.
- **Real-time Monitoring**: Can be extended to monitor attendance in real-time.

---

## **Technologies Used**

- **Java**: Programming language for implementing the core logic.
- **MySQL**: Database to store attendance records.
- **JDBC**: Java Database Connectivity for interacting with MySQL.
- **FRAMEWORK**:Springboot.
- **Maven/Gradle**: Dependency management for libraries like OpenCV and MySQL Connector.

---

## **Installation**

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/Face-Detection-Attendance.git
   cd Face-Detection-Attendance
   ```

2. **Set Up Database**
   
   - Create a MySQL database called `face_detector`:

     ```sql
     CREATE DATABASE face_detector;
     ```

   - Create a table called `faces` to store attendance details:

     ```sql
     USE face_detector;

     CREATE TABLE faces (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(255),
         image_path VARCHAR(255),
         timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
     );
     ```

3. **Configure Database Connection**
   
   - Open `DatabaseHelper.java` and set the appropriate database credentials:
   
     ```java
     String url = "jdbc:mysql://localhost:3306/face_detector";  // Database URL
     String user = "root";  // Your MySQL username
     String password = "root";  // Your MySQL password
     ```

4. **Install Dependencies**

   If you are using **Maven**, add dependencies for OpenCV and MySQL Connector to your `pom.xml`:

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.opencv</groupId>
           <artifactId>opencv</artifactId>
           <version>4.5.1</version> <!-- Use the latest version -->
       </dependency>
       <dependency>
           <groupId>mysql</groupId>
           <artifactId>mysql-connector-java</artifactId>
           <version>8.0.23</version> <!-- Use the latest version -->
       </dependency>
   </dependencies>
   ```

   If you're using **Gradle**, add the dependencies to your `build.gradle` file:

   ```gradle
   dependencies {
       implementation 'org.opencv:opencv:4.5.1' // Use the latest version
       implementation 'mysql:mysql-connector-java:8.0.23' // Use the latest version
   }
   ```

5. **Run the Application**

   Compile and run the application using your IDE or command line:

   ```bash
   javac MainApplication.java
   java MainApplication
   ```

   - The system will prompt you for an image file to detect faces from.
   - After detecting the faces, it will save the attendance data to the database and display a success message.

---

## **Usage**

1. **Enter the Input Image Path**:
   - Provide the path to the image where faces need to be detected.

2. **Enter the Name for Detected Face(s)**:
   - After detecting the faces, the system asks for the name of the individual for attendance marking.

3. **Output**:
   - The image with detected faces will be saved to the specified output location.
   - Attendance details will be stored in the `faces` table of the MySQL database.

---

## **Troubleshooting**

- **Unknown Database Error**: If you encounter an error about the unknown database, ensure the database `face_detector` exists and has the correct structure.
  
  ```sql
  CREATE DATABASE face_detector;
  ```

- **OpenCV Not Found**: Ensure that the OpenCV library is correctly linked to your project. Follow the OpenCV setup instructions for Java.
  
- **JDBC Connection Issues**: Double-check your MySQL username, password, and database URL in the `DatabaseHelper` class.

---

## **License**

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## **Contributing**

Feel free to fork the repository, make improvements, and submit pull requests. Contributions are welcome!

---

## **Author**

[priti singh](https://github.com/pritisingh196)

---

This README gives a concise overview of the project, its features, setup instructions, and how to use it. You can expand it further based on additional features or customizations you may have added. Let me know if you need more details!
