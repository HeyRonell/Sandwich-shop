package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double discount = 0;
        double sando1 = 5.45;
        double sando2 = 8.95;


        System.out.println("Welcome to Ron's Sandwich Shop!");
        System.out.println("Which size would you like? 1 or 2");
        double optionChoice = read.nextInt();

        if (optionChoice == 1) {
            optionChoice = sando1;
            System.out.println("You chose option 1.");
        }
        else {
            optionChoice = sando2;
            System.out.println("You chose option 2.");
        };

//        This code is currently not working as intended
        System.out.println("\nHow old are you by chance?");
        int age = read.nextInt();
        if (age <= 17) {
            discount = 0.1;
        }
        else if (age >= 65) {
            discount = 0.2;

        }
        else {
            discount = 0;
        }


        System.out.printf("Sounds good! Because you are %d we'll be providing a %.2f percent discount!", age, discount);

        double discountedAmount = optionChoice * discount;
        double totalCost = optionChoice - discountedAmount;

        System.out.printf("\nYour total today will be: $%.2f", totalCost);

        read.close();


    }
}
