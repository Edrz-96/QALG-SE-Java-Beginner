package com.qa.menu;

import com.qa.utility.UtilityScanner;

import java.util.Scanner;

public class Menu {

    static String action;
    static String questionString = "Press the corresponding key for the task you'd like to perform";

    public static void run() {

        accessInitial();
    }

    public static void exitMenu() {
        System.out.println("GoodBye!");
    }

    public static void accessInitial() {
        action = initialMenu(); // Return String
        initialSelection(action); //Send String to menu
    }

    public static void accessGarage() {
        action = garageMenu();// Return String
        garageSelection(action); //Send String to menu
    }


    public static String initialMenu() {
        String menuString = "==================================================\n"

                + "Welcome to Ed's Garage, please see the below processes available: \n"

                + "==================================================\n"
                + "1: View the available garages\n"
                + "2: Add garages\n"
                + "3: Delete an existing garage\n"
                + "4: Modify a garage\n"
                + "5: Quit\n"
                + "==================================================\n";

        System.out.println(menuString + questionString);

        return UtilityScanner.returnString();

    }

    public static String garageMenu() {
        String garageString = "==================================================\n"

                + "You're modifying garages in the database:\n"

                + "==================================================\n"
                + "1: Modify garage name\n"
                + "2: Add vehicles to garage\n"
                + "3: Return\n"
                + "4: Quit\n"
                + "==================================================\n";

        System.out.println(garageString + questionString);

        return UtilityScanner.returnString();

    }

    public static String vehicleMenu() {
        String garageString = "==================================================\n"

                + "You're accessing the vehicles database, what type of vehicle do you need to modify?\n"

                + "==================================================\n"
                + "1: Car"
                + "2: Boat"
                + "3: Plane"
                + "==================================================\n";

        System.out.println(garageString + questionString);

        return UtilityScanner.returnString();

    }

    public static String carMenu() {
        String garageString = "==================================================\n"

                + "You're accessing the car database:\n"

                + "==================================================\n"
                + "1: Add a car"
                + "2: Update a car"
                + "3: Delete a car"
                + "4: View all cars"
                + "5: return to main menu"
                + "==================================================\n";

        System.out.println(garageString + questionString);

        return UtilityScanner.returnString();

    }

    public static String boatMenu() {
        String garageString = "==================================================\n"

                + "You're accessing the boat database:\n"

                + "==================================================\n"
                + "1: Add a boat"
                + "2: Update a boat"
                + "3: Delete a boat"
                + "4: View all boats"
                + "5: return to main menu"
                + "==================================================\n";

        System.out.println(garageString + questionString);

        return UtilityScanner.returnString();

    }

    public static String planeMenu() {
        String garageString = "==================================================\n"

                + "You're accessing the plane database:\n"

                + "==================================================\n"
                + "1: Add a plane"
                + "2: Update a plane"
                + "3: Delete a plane"
                + "4: View all planes"
                + "5: return to main menu"
                + "==================================================\n";

        System.out.println(garageString + questionString);

        return UtilityScanner.returnString();

    }

    public static void initialSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("nothing");
                break;
            case "2":
                System.out.println("nothing");
                break;
            case "3":
                System.out.println("nothing");
                break;
            case "4":
                accessGarage();
                break;
            case "5":
                exitMenu();
                break;
            default:
                System.out.println("No match found");
                break;

        }

    }

    public static void garageSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("nothing");
                break;
            case "2":
                System.out.println("nothing");
                break;
            case "3":
                accessInitial();
                break;
            case "4":
                exitMenu();
                break;
            default:
                System.out.println("No match found");
                break;

        }
    }

    public static void carSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("Adding car to database");
                break;
            case "2":
                System.out.println("Updating car in database");
                break;
            case "3":
                System.out.println("Deleting car in database");
                break;
            case "4":
                System.out.println("All cars in database:");
                break;
            case "5":
                accessInitial();
                break;
            default:
                System.out.println("No match found");
                break;

        }
    }
    public static void planeSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("Adding plane to database");
                break;
            case "2":
                System.out.println("Updating plane in database");
                break;
            case "3":
                System.out.println("Deleting plane in database");
                break;
            case "4":
                System.out.println("All planes in database:");
                break;
            case "5":
                accessInitial();
                break;
            default:
                System.out.println("No match found");
                break;

        }
    }

    public static void boatSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("Adding boat to database");
                break;
            case "2":
                System.out.println("Updating boat in database");
                break;
            case "3":
                System.out.println("Deleting boat in database");
                break;
            case "4":
                System.out.println("All boats in database:");
                break;
            case "5":
                accessInitial();
                break;
            default:
                System.out.println("No match found");
                break;

        }
    }
}
