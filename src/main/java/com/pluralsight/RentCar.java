package com.pluralsight;
import java.util.Scanner;

public class RentCar {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int numRentalDays = 0;
        boolean isToll = false;
        String pickUpDate = "";
        float addOnPrice = 0;
        int userAge;

        System.out.println("When do you want to be picked up?: ");
        pickUpDate = myScanner.nextLine();


        System.out.println("How many days would you like to rent the car?: ");
        userInput = myScanner.nextLine();
        numRentalDays = Integer.parseInt(userInput);


        System.out.println("you want electronic toll tag at $3.95/day? (yes/no)");
        userInput = myScanner.nextLine();
        if(userInput.equalsIgnoreCase("yes")){
            isToll = true;
            addOnPrice += 3.95;
        } else if(userInput.equalsIgnoreCase("no")){
            isToll = false;
        } else{
            System.out.println("Invalid Input");
            System.exit(1);
        }


        System.out.println("Do you want GPS at $2.95? (yes/no)");
        userInput = myScanner.nextLine();

        if(userInput.equalsIgnoreCase("yes")){
            addOnPrice += 2.95f;
        } else if(userInput.equalsIgnoreCase("no")){
            //pass
        } else{
            System.out.println("Invalid Input");
            System.exit(1);
        }

        System.out.println("do you want roadside assistance at $3.95/day? (yes/no)");
        userInput = myScanner.nextLine();

        if(userInput.equalsIgnoreCase("yes")){
            addOnPrice += 3.95f;
        } else if(userInput.equalsIgnoreCase("no")){
            //pass
        } else{
            System.out.println("Invalid Input");
            System.exit(1);
        }


        System.out.println("How old are you?: ");
        userInput = myScanner.nextLine();
        userAge = Integer.parseInt(userInput);

    }
}
