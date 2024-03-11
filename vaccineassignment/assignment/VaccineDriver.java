/*
 * Name: Darren Billy
 * Prograrm Name: Vaccinedriver
 * Program Details: This is the vaccine driver that will output the details for
 * different vaccine prices and name and cost per unit.
 * Class: COSC 1200 Object Oriented Programming
 * 
*/

package assignment;

import java.util.Calendar;
import java.util.Date;

public class VaccineDriver {
    public static void main(String[] args) {
        // Opening comment
        System.out.println("Author: [Darren Billy]");
        System.out.println("Program: Vaccine Management System");
        System.out.println("Date: 2024-March-6");
        System.out.println("Description: This program manages COVID19 variant JN.1 Vaccines.");

        // Create an empty Vaccine using the default constructor
        Vaccine emptyVaccine = new Vaccine();
        
        // Display the values of the empty Vaccine in a non-linear format
        System.out.println("Empty Vaccine Details:");
        emptyVaccine.display();
        System.out.println(); // Add a blank line for clarity
        
        // Use the setters to add values to the empty Vaccine
        emptyVaccine.setVaccineId(1);
        emptyVaccine.setVaccineName("VaxJN1");
        emptyVaccine.setCostPerUnit(25.5);
        emptyVaccine.setAvailableUnits(100);

        // Set expiry date to today's date (2024-March-6)
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.MARCH, 6);
        Date expiryDate = calendar.getTime();
        emptyVaccine.setExpiryDate(expiryDate);

        emptyVaccine.setSpecialInstructions("Store at cool temperature");

        // Display the values of the Vaccine in a non-linear format
        System.out.println("Modified Vaccine Details:");
        emptyVaccine.display();
        System.out.println(); // Add a blank line for clarity
        
        // Use the parameterized Constructor to create two more vaccines
        @SuppressWarnings("deprecation")
		Vaccine vaccine1 = new Vaccine(2, "VaxJN2", 30.0, 150, new Date(2025, 6, 30), "Handle with care");
        @SuppressWarnings("deprecation")
		Vaccine vaccine2 = new Vaccine(3, "VaxJN3", 35.0, 200, new Date(2025, 9, 15), "Keep away from sunlight");
        @SuppressWarnings("deprecation")
        Vaccine vaccine3 = new Vaccine(4, "VaxJN4", 40.0, 250, new Date(2025, 12, 31), "Handle with care");
        @SuppressWarnings("deprecation")
		Vaccine vaccine4 = new Vaccine(5, "VaxJN5", 45.0, 300, new Date(2026, 3, 15), "Store in a dry place");
        @SuppressWarnings("deprecation")
		Vaccine vaccine5 = new Vaccine(6, "VaxJN6", 50.0, 350, new Date(2026, 6, 30), "Shake well before use");
        @SuppressWarnings("deprecation")
		Vaccine vaccine6 = new Vaccine(7, "VaxJN7", 55.0, 400, new Date(2026, 9, 15), "Administer within 24 hours");
        // Create an array to save all the vaccines
     // Create an array to save all the vaccines
        Vaccine[] vaccines = new Vaccine[7];
        vaccines[0] = emptyVaccine;
        vaccines[1] = vaccine1;
        vaccines[2] = vaccine2;
        vaccines[3] = vaccine3;
        vaccines[4] = vaccine4;
        vaccines[5] = vaccine5;
        vaccines[6] = vaccine6;

        
        // Display the contents of Vaccines in a table format
        System.out.println("All Vaccines Details:");
        System.out.println("SKU | Vaccine Name | Unit Cost | QTY | Expiry | Special Instructions");
        System.out.println("----|--------------|-----------|-----|--------|---------------------");
        for (Vaccine vaccine : vaccines) {
            vaccine.display();
        }
    }
}