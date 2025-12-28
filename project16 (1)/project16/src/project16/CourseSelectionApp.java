package project16;

import java.util.Scanner;



class Course {
    String name;
    String description;
    String infoOffice;

    public Course(String name, String description, String infoOffice) {
        this.name = name;
        this.description = description;
        this.infoOffice = infoOffice;
    }


    void showCourseDescription() {
        System.out.println(name + " course: " + description);
        System.out.println("More info offices: " + infoOffice);
    }
}

class PhysicalScience extends Course {
    public PhysicalScience() {
        super("Physical Science", "This course focuses on the study of basics of chemistry,\n" +
                "you are allowed to use chemicals and glassware under the guidance of teaching assistants", "B1 212");
    }
}

class BiologicalScience extends Course {
    public BiologicalScience() {
        super("Biological Science", "This course focuses on the study of advanced chemistry,\n" +
                "you are allowed to use chemicals and glassware without guidance of teaching assistant", "B1 333");
    }
}

class AppliedChemistry extends Course {
    public AppliedChemistry() {
        super("Applied Chemistry", "This course focuses on the study of advanced chemistry,\n" +
                "you are allowed to use chemicals and glassware without guidance of teaching assistants", "B1 356");
    }
}

class EnvironmentalManagement extends Course {
    public EnvironmentalManagement() {
        super("Environmental Management", "This course focuses on the study of basics of chemistry,\n" +
                "you are allowed to use chemicals and glassware under the guidance of teaching assistants", "B1 295");
    }
}

public class CourseSelectionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the chemistry Department Information System!");

        // Display the list of available courses
        System.out.println("Select a course:");
        System.out.println("1. Physical Science");
        System.out.println("2. Biological Science");
        System.out.println("3. Applied Chemistry");
        System.out.println("4. Environmental Management");

        // Get user input for course selection
        System.out.print("Enter the number corresponding to your desired course: ");
        int courseChoice = scanner.nextInt();

        Course selectedCourse;

        // Determine the selected course based on user input
        switch (courseChoice) {
            case 1:
                selectedCourse = new PhysicalScience();
                break;
            case 2:
                selectedCourse = new BiologicalScience();
                break;
            case 3:
                selectedCourse = new AppliedChemistry();
                break;
            case 4:
                selectedCourse = new EnvironmentalManagement();
                break;
            default:
                System.out.println("Invalid course selection. Exiting program.");
                return;
        }

        // Display the description of the selected course
        System.out.println("\nCourse Information:");
        selectedCourse.showCourseDescription();

        // Close the scanner
        scanner.close();
    }
}

