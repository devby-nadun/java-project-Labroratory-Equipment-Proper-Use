package project16;

import java.util.HashMap;
import java.util.Scanner;

// Abstract class Chemical
abstract class Chemical {
    private String id;
    private String expiryDate;

    public Chemical(String id, String expiryDate) {
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public String getId() {
        return id;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Abstract method to get the type of chemical
    public abstract String getType();
}

// Derived class for Acid
class Acid extends Chemical {
    public Acid(String id, String expiryDate) {
        super(id, expiryDate);
    }

    @Override
    public String getType() {
        return "Acid";
    }
}

// Derived class for Base
class Base extends Chemical {
    public Base(String id, String expiryDate) {
        super(id, expiryDate);
    }

    @Override
    public String getType() {
        return "Base";
    }
}

// Derived class for Neutral
class Neutral extends Chemical {
    public Neutral(String id, String expiryDate) {
        super(id, expiryDate);
    }

    @Override
    public String getType() {
        return "Neutral";
    }
}

public class ChemicalDetails {
    public static void main(String[] args) {
        HashMap<String, Chemical> chemicalDetails = new HashMap<>();
        chemicalDetails.put("HCL", new Acid("A1", "2024/12/2"));
        chemicalDetails.put("H2SO4", new Acid("A2", "2024/12/8"));
        chemicalDetails.put("HNO3", new Acid("A3", "2024/01/03"));
        chemicalDetails.put("NAOH", new Base("B1", "2026/09/9"));
        chemicalDetails.put("KOH", new Base("B2", "2026/09/02"));
        chemicalDetails.put("MG(OH)2", new Base("B3", "2025/09/03"));
        chemicalDetails.put("Table Salt", new Neutral("N1", "2020/07/04"));
        chemicalDetails.put("Distilled Water", new Neutral("N2", "2021/09/9"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of an acid, base, or neutral chemical:");
        String chemicalName = scanner.nextLine().toUpperCase();

        Chemical chemical = chemicalDetails.get(chemicalName);
        if (chemical != null) {
            System.out.println("Chemical Type: " + chemical.getType());
            System.out.println("Chemical ID: " + chemical.getId());
            System.out.println("Expiry Date: " + chemical.getExpiryDate());
        } else {
            System.out.println("Chemical not found.");
        }
    }
}