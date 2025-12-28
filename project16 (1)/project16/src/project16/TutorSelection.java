package project16;

import java.util.Scanner;

public class TutorSelection {

    public static void main(String[] args) {
        System.out.println("-------Select your tutor-------");
        String[] tutors = {"A    : Ann", "B    : Jane", "C    : Kamal", "D    : Fathima", "E    : Chula"};

        for (String tutor : tutors) {
            System.out.println(tutor);
        }

        Scanner scanner = new Scanner(System.in);
        String teacherChoice = scanner.nextLine();

        selectTutor(teacherChoice);
    }

    public static void selectTutor(String teacherChoice) {
        switch (teacherChoice.toUpperCase()) {
            case "A":
                System.out.println("Teacher Ann was selected as the choice of children.");
                break;
            case "B":
                System.out.println("Teacher Jane was selected as the choice of children.");
                break;
            case "C":
                System.out.println("Teacher Kamal was selected as the choice of children.");
                break;
            case "D":
                System.out.println("Teacher Fathima was selected as the choice of children.");
                break;
            case "E":
                System.out.println("Teacher Chula was selected as the choice of children.");
                break;
            default:
                System.out.println("No valid teacher selected.");
        }
    }
}
