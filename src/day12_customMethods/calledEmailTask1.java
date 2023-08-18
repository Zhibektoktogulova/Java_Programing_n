package day12_customMethods;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class calledEmailTask1 {

    public static void main(String[] args) {
        // Format Full name

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", " ");

        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace("", " ");

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        // getting first character of first name + the remaining characters of the first name
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " "+last;

        System.out.println(fullName);







    }
}
