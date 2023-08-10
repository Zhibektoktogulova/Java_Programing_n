package day09_scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String full_name = input.nextLine();// Azamat Amankulov

        input.nextLine();

        System.out.println("Enter your school name");
        String school_name = input.nextLine(); //Cydeo

        System.out.println("Enter your gender:");
        String gender = input.next(); // Male

        System.out.println("Enter your age:");
        int age = input.nextInt(); // 32

        input.nextLine(); //we have to give extra nextLine(); METHOD AFTER THE INT
        System.out.println("Enter your street name:");
        String street = input.nextLine();

    }
}
