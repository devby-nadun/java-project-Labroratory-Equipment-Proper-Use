package project16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabSchedule {
    public static void main(String[] args) {
        // Define the schedule for each day
        Map<String, String> schedule = new HashMap<>();
        schedule.put("Monday", "1 pm to 4 pm - PS Student");
        schedule.put("Tuesday", "9 am to 12 pm - BS Student");
        schedule.put("Wednesday", "1 pm to 4 pm - Appliedchem and ENCM student");

        // Define the courses scheduled for each day
        Map<String, String> courses = new HashMap<>();
        courses.put("Monday", "Chemistry Lab");
        courses.put("Tuesday", "Biology Lab");
        courses.put("Wednesday", "Physics Lab");

        // Ask the user to select a day
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a day for your lab practical (Monday, Tuesday, Wednesday):");
        String selectedDay = scanner.nextLine();

        // Check if the selected day is valid
        if (schedule.containsKey(selectedDay)) {
            // Output the schedule for the selected day
            System.out.println("Scheduled time for " + selectedDay + ": " + schedule.get(selectedDay));
            System.out.println("Course scheduled for " + selectedDay + ": " + courses.get(selectedDay));

            // Ask if the user can participate in the lab on the selected day
            System.out.println("Can you participate in the lab on " + selectedDay + "? (yes/no)");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                // Output the time schedule for the lab
                System.out.println("Your lab schedule for " + selectedDay + ": " + schedule.get(selectedDay));
            } else {
                System.out.println("Please select another day for your lab practical.");
            }
        } else {
            System.out.println("Invalid day selection. Please choose from Monday, Tuesday, or Wednesday.");
        }
    }
}

