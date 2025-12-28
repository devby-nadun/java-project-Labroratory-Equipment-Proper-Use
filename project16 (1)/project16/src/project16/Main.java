package project16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StudentNumber {
    private String studentID;
    private String yearOfStudy;

    // Constructor
    public StudentNumber(String studentID, String yearOfStudy) {
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
    }

    // Getter methods
    public String getStudentID() {
        return studentID;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    // Method to validate student number
    public boolean isValidStudentNumber(Map<String, String> validStudentNumbers) {
        return validStudentNumbers.containsKey(studentID);
    }
}

public class Main {
    public static void main(String[] args) {
        // Simulate valid student numbers
        Map<String, String> validStudentNumbers = new HashMap<>();
        validStudentNumbers.put("2021/002", "2021/2022");
        validStudentNumbers.put("2021/004", "2021/2022");
        validStudentNumbers.put("2021/006", "2021/2022");
        validStudentNumbers.put("2021/008", "2021/2022");
        validStudentNumbers.put("2021/010", "2021/2022");
        validStudentNumbers.put("2021/012", "2021/2022");
        validStudentNumbers.put("2021/014", "2021/2022");
        validStudentNumbers.put("2021/016", "2021/2022");
        validStudentNumbers.put("2021/018", "2021/2022");
        validStudentNumbers.put("2021/020", "2021/2022");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student number: ");
        String inputStudentNumber = scanner.nextLine();

        // Create student object
        StudentNumber student = new StudentNumber(inputStudentNumber, "");

        // Validate student number
        System.out.println("Student ID: " + student.getStudentID());
        if (student.isValidStudentNumber(validStudentNumbers)) {
            System.out.println("Valid student number");
            System.out.println("Year of Study: " + validStudentNumbers.get(inputStudentNumber));
        } else {
            System.out.println("Invalid student number");
        }
    }
}

