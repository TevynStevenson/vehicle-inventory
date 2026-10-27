package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    public static void main(String[] args) {

        //create a scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt user to make input 1-6
        System.out.println("What do you want to do?");

        //create an array of capable of holding up to 20 vehicles
       Vehicle[] inventory = new Vehicle[20];

        //create a variable that tells me how many vehicles are in the array right now
       int numberOfVehiclesInInventory = inventory.length;

       //Create 6 vehicles
        Vehicle vehicle1 = new Vehicle(100, "Miata", "Blue", 100000);
        Vehicle vehicle2 = new Vehicle(124, "Mustang", "Red", 75000);
        Vehicle vehicle3 = new Vehicle(125, "Camry", "White", 50000);
        Vehicle vehicle4 = new Vehicle(126, "Civic", "Black", 60000);
        Vehicle vehicle5 = new Vehicle(127, "Corvette", "Yellow", 25000);
        Vehicle vehicle6 = new Vehicle(128, "Charger", "Gray", 80000);

        inventory[0] = vehicle1;
        inventory[1] = vehicle2;
        inventory[2] = vehicle3;
        inventory[3] = vehicle4;
        inventory[4] = vehicle5;
        inventory[5] = vehicle6;

        //create a loop with this menu in the long

        /*
        1- List all vehicles
        2- Search by make/model
        3-Search by price range
        4- Search by color
        5-Add a vehicle
        6-Quit
        Enter Your Command
         */

        // focus on menu items 1,2, and 5
        boolean appRunning = true;
        while(appRunning){

            //Create the rules
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter your command:");
            //store the answer
            int command = scanner.nextInt();

            //Prompt user to enter command




            switch (command){
                case 1 -> listAllVehicles(inventory);
                case 5 -> addVehicle(scanner,inventory);
                case 6 -> System.out.println("Invalid command");
            }

            for(Vehicle type : inventory){
                System.out.println();
            }



        }




    }


    public static void addVehicle(Scanner theScanner, Vehicle[] inventory){
        // ask all the questions
        System.out.println("Please enter the vehicles id");
        int id = theScanner.nextInt();

        //eat the newline
        theScanner.nextLine();

        System.out.println("Please enter the make");
        String makeModel = theScanner.nextLine();
        System.out.println("Please enter the color");
        String color = theScanner.nextLine();
        System.out.println("Please enter the price");
        double price = theScanner.nextDouble();

        //create the vehicle

    }

public static void listAllVehicles (Vehicle[] inventory){
    System.out.println("make : " + inventory[0].getMakeModel());
}


}
