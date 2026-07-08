# Student Management System

## Project Overview

The Student Management System is a Java desktop application developed using Java Swing for the graphical user interface (GUI) and MySQL as the backend database. It allows users to manage student records efficiently by performing CRUD (Create, Read, Update, Delete) operations.

The application provides a user-friendly dashboard through which users can add, view, search, update, and delete student information. All data is stored permanently in a MySQL database using JDBC connectivity.

---

# Technologies Used

### Frontend

* Java Swing
* AWT

### Backend

* Java
* JDBC (Java Database Connectivity)

### Database

* MySQL Community Server
* MySQL Workbench

### Development Environment

* Visual Studio Code
* JDK 17 (or later)
* MySQL Connector/J (JDBC Driver)

---

# Features

* Add New Student
* View All Students
* Search Student by Roll Number
* Update Student Details
* Delete Student Record
* User-Friendly Dashboard
* MySQL Database Connectivity

---

# Project Structure

```
StudentManagementSystem
│
├── lib
│   └── mysql-connector-j.jar
│
├── src
│   ├── Main.java
│   ├── Dashboard.java
│   ├── DBConnection.java
│   ├── Student.java
│   ├── StudentDAO.java
│   ├── AddStudentForm.java
│   ├── ViewStudentsForm.java
│   ├── SearchStudentForm.java
│   ├── UpdateStudentForm.java
│   └── DeleteStudentForm.java
│
├── out
└── README.md
```

---

# Database Details

### Database Name

```
studentdb
```

### Table Name

```
students
```

### Table Structure

| Column  | Data Type                         |
| ------- | --------------------------------- |
| id      | INT (Auto Increment, Primary Key) |
| rollNo  | VARCHAR(20)                       |
| name    | VARCHAR(100)                      |
| age     | INT                               |
| gender  | VARCHAR(20)                       |
| course  | VARCHAR(100)                      |
| phone   | VARCHAR(15)                       |
| email   | VARCHAR(100)                      |
| address | VARCHAR(255)                      |

---

# Database Connection

The application connects to MySQL using JDBC.

Example configuration:

```
URL      : jdbc:mysql://localhost:3306/studentdb
Username : root
Password : ********
```

The database connection is managed through the `DBConnection.java` class.

---

# Backend Architecture

The backend follows a simple layered structure.

### DBConnection.java

* Establishes the connection between Java and MySQL.
* Returns a Connection object.

### Student.java

* Model class.
* Stores student details such as roll number, name, age, course, phone, email, and address.

### StudentDAO.java

Handles all database operations:

* Insert Student
* Display Students
* Search Student
* Update Student
* Delete Student

PreparedStatement is used to execute SQL queries securely.

---

# Frontend Architecture

The application uses Java Swing to build the graphical user interface.

### Dashboard

Main window containing buttons for all operations.

### Add Student Form

Allows users to enter student details and save them into the database.

### View Students Form

Displays all student records in a JTable.

### Search Student Form

Searches a student using the Roll Number.

### Update Student Form

Updates phone number and email of an existing student.

### Delete Student Form

Deletes a student record based on Roll Number.

---

# CRUD Operations

### Create

Adds a new student record to the database.

### Read

Displays all student records and searches specific students.

### Update

Updates student information.

### Delete

Removes student records permanently.

---

# How to Run the Project

### Step 1

Compile the project:

```
javac -cp "lib/*" src/*.java -d out
```

### Step 2

Run the application:

```
java -cp "out;lib/*" Main
```

---

# Future Enhancements

* Student Login System
* Admin Login
* Attendance Management
* Marks Management
* Fee Management
* Report Generation
* Export Data to PDF or Excel
* Improved Dashboard Design
* Input Validation
* Student Photo Upload

---

# Learning Outcomes

This project demonstrates the implementation of:

* Core Java Programming
* Object-Oriented Programming (OOP)
* Java Swing GUI Development
* JDBC Connectivity
* MySQL Database Management
* CRUD Operations
* Exception Handling
* Desktop Application Development

---

# Conclusion

The Student Management System is a desktop-based Java application that provides an efficient solution for managing student records. The project successfully integrates Java Swing for the user interface, JDBC for database connectivity, and MySQL for persistent data storage. It demonstrates the practical use of CRUD operations and object-oriented programming concepts in building a real-world desktop application.
