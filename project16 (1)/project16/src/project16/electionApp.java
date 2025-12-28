package project16;

import java.util.Scanner;


class Chemicalet {
    String setName;
    String equipments;
    String location;

    public Chemicalet(String setName, String equipments, String location) {
        this.setName = setName;
        this.equipments = equipments;
        this.location = location;
    }

    void showetDetails() {
        System.out.println(setName + " set: " + equipments);
        System.out.println("Location: " + location);
    }
}

class TitrationSet extends Chemicalet {
    public TitrationSet() {
        super("Titration", "Burette,Pipette,Volumetric flask,Erlenmeyer flask,Conical flask,indicators", "Chemistry Lab A1");
    }
}

class TLCSet extends Chemicalet {
    public TLCSet() {
        super("TLC", "TLC Plates,Solvent,Capillary tubes and micropipettes,UV lamp,Spotting template", "Chemistry Lab B2");
    }
}

class AnalysisSet extends Chemicalet {
    public AnalysisSet() {
        super("Analysis", "Titration equipments,particle size analyzer,Mass spectrometer,glassware", "Chemistry Lab C3");
    }
}

public class electionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chemical Equipment Selection System!");

        // Display the list of available equipment sets
        System.out.println("Select an equipment set:");
        System.out.println("1. Titration Set");
        System.out.println("2. TLC Set");
        System.out.println("3. Analysis Set");

        // Get user input for equipment set selection
        System.out.print("Enter the number corresponding to your desired equipment set: ");
        int setChoice = scanner.nextInt();

        Chemicalet selectedSet;

        // Determine the selected equipment set based on user input
        switch (setChoice) {
            case 1:
                selectedSet = new TitrationSet();
                break;
            case 2:
                selectedSet = new TLCSet();
                break;
            case 3:
                selectedSet = new AnalysisSet();
                break;
            default:
                System.out.println("Invalid equipment set selection. Exiting program.");
                return;
        }

        // Display the details of the selected equipment set
        System.out.println("\nEquipment Set Information:");
        selectedSet.showetDetails();

        // Close the scanner
        scanner.close();
    }
}
