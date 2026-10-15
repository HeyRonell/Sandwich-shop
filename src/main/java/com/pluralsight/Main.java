package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double discount = 0;
        double sando1 = 5.45;
        double sando2 = 8.95;
        double loadedAdditional = 0.00;


        System.out.println("Welcome to Ron's Sandwich Shop!");
        System.out.println("Which size would you like? 1 or 2");
        double optionChoice = read.nextInt();

//        Determining which sandwich the customer wants.
        if (optionChoice == 1) {
            optionChoice = sando1;
            System.out.println("You chose option 1.");
        } else {
            optionChoice = sando2;
            System.out.println("You chose option 2.");
        }

        read.nextLine();

//        This will add an additional cost. Only accepts true or false.
        System.out.println("Would you like it LOADED?");
        String isLoaded = read.nextLine();
        if (isLoaded.equalsIgnoreCase("yes")) {
            if (optionChoice == sando1) {
                loadedAdditional = 1.00;
            }
            else if (optionChoice == sando2) {
                loadedAdditional = 1.75;
            }
            else {
                loadedAdditional = 0;
                System.out.println("We'll keep it regular.");
            }


            System.out.println("\nHow old are you by chance?");
            int age = read.nextInt();
            if (age <= 17) {
                discount = 0.1;
            } else if (age >= 65) {
                discount = 0.2;

            } else {
                discount = 0;
            }


            System.out.printf("Sounds good! Because you are %d we'll be providing a %.2f percent discount!", age, discount);

//        Calculating the information provided.
            double discountedAmount = (optionChoice + loadedAdditional) * discount;
            double totalCost = (optionChoice + loadedAdditional) - discountedAmount;

            System.out.printf("\nYour total today will be: $%.2f", totalCost);

            read.close();


        }
    }
}