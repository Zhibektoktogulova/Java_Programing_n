package day11_StringMethods;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String correctUsername = "Cydeo", // literal
               correctPassword = "Wooden Spoon"; // literal

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your username");
        String username = input.nextLine(); // new keyword

        System.out.println("Enter your password");
        String password = input.nextLine();

        input.close();


        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You are now logged in");
        }else{
            System.out.println("Incorect username or password. Please enter try again");
        }




    }
}
