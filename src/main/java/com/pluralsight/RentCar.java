package com.pluralsight;
import java.util.Scanner;

/**
 *
 * Exercise 1: Rental Car Console Application – Section 4.3
 * @author Behlul Vardal
 */
public class RentCar {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int numRentalDays;
        String pickUpDate = "";
        float addOnPrice = 0;
        int userAge;
        float dailyCarRentalRate = 29.99f;
        float totalCost;
        float underageSurcharge = 0;


        //User Input: Pick Up Date
        System.out.print("When do you want to be picked up?: ");
        pickUpDate = myScanner.nextLine();


        //Input
        System.out.print("How many days would you like to rent the car?: ");
        userInput = myScanner.nextLine();
        numRentalDays = Integer.parseInt(userInput);


        System.out.print("you want electronic toll tag at $3.95/day? (yes/no): ");
        userInput = myScanner.nextLine();

        switch (userInput.toLowerCase()) {
            case "yes" -> {
                addOnPrice += 3.95f;
            }
            case "no" -> {
                break;
            }
            default ->  {
                System.out.println("Invalid input!");
                System.exit(1);
            }
        }

        System.out.print("Do you want GPS at $2.95? (yes/no): ");
        userInput = myScanner.nextLine();

        switch (userInput.toLowerCase()) {
            case "yes" -> addOnPrice += 2.95f;
            case "no" -> addOnPrice += 0;
            default -> {
                System.out.println("Invalid Input");
                System.exit(1);
            }
        }

        System.out.print("do you want roadside assistance at $3.95/day? (yes/no): ");
        userInput = myScanner.nextLine();

        switch(userInput.toLowerCase()){
            case "yes" -> addOnPrice += 3.95f;
            case "no" -> addOnPrice += 0;
            default -> {
                System.out.println("Invalid Input!");
                System.exit(1);
            }
        }

        System.out.print("How old are you?: ");
        userInput = myScanner.nextLine();
        userAge = Integer.parseInt(userInput);
        if (userAge < 25) {
            underageSurcharge =  dailyCarRentalRate * 0.3f;
        }


        /*
         * ######### Receipt #######
         * Basic car rental price
         * Options cost
         * underage surcharge
         * total
         */

        float totalCarRental = dailyCarRentalRate * numRentalDays; //total rate for num of days
        totalCost = totalCarRental + underageSurcharge + addOnPrice;

        String recipt = String.format("""
                ######## Receipt #########\s
                Basic Car rental: $%.2f
                Options Cost: $%.2f
                Underage Driver Surcharge: $%.2f
                Total Cost: $%.2f
                """, totalCarRental, addOnPrice, underageSurcharge, totalCost);

        System.out.println(recipt);
    }
}
