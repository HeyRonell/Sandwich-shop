package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double discount = 0;
        char firstOption = 'a';
        char secondOption = 'b';

        System.out.println("Welcome to Ron's Sandwich Shop!");
        System.out.println("Which size would you like? a or b");
        float optionChoice = read.nextFloat();

        if optionChoice (equals 'a'); {
            optionChoice = firstOption;
        }
        else {
            optionChoice = secondOption;
        }

        System.out.printf("Of course. %c on the way!", optionChoice);

//        This code is currently not working as intended
        System.out.println("How old are you by chance?");
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

        System.out.printf("Sounds good! Because you are %d we'll be providing a %f discount!", age, discount);

        read.close();


    }
}
