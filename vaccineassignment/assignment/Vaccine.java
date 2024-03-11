/*
 * Name: Darren Billy
 * Prograrm Name: Vaccine
 * Program Details: This is the vaccine driver that will output the details for
 * different vaccine prices and name and cost per unit.
 * Class: COSC 1200 Object Oriented Programming
 * 
*/


package assignment;

import java.io.Closeable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vaccine {
    private int vaccineId;
    private String vaccineName;
    private double costPerUnit;
    private int availableUnits;
    private Date expiryDate; // Using java.util.Date for expiry date
    private String specialInstructions;

    // Default constructor
    public Vaccine() {
        this.vaccineId = 0;
        this.vaccineName = "";
        this.costPerUnit = 0.0;
        this.availableUnits = 0;
        this.expiryDate = null;
        this.specialInstructions = "";
    }

    // Parameterized constructor
    public Vaccine(int vaccineId, String vaccineName, double costPerUnit, int availableUnits, Date expiryDate, String specialInstructions) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.costPerUnit = costPerUnit;
        this.availableUnits = availableUnits;
        this.expiryDate = expiryDate; // Assigning java.util.Date object to expiryDate
        this.specialInstructions = specialInstructions;
    }

    // Getters and Setters
    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

 // Display method to print vaccine details
    public void display() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (expiryDate != null) {
            System.out.printf("%-3d | %-13s | $%-9.2f | %-4d | %-10s | %s%n",
                    vaccineId, vaccineName, costPerUnit, availableUnits,
                    dateFormat.format(expiryDate), specialInstructions);
        } else {
            System.out.printf("%-3d | %-13s | $%-9.2f | %-4d | %-10s | %s%n",
                    vaccineId, vaccineName, costPerUnit, availableUnits,
                    "N/A", specialInstructions);
        }
    }
}