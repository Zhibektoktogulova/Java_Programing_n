package day12_customMethods;
import java.util.Scanner;
public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first_name = input.next().trim().replace(" ", "");
     //trim(0 & replace() methods will make sure that the white spaces & additionals spaces between the characters will be removed
        System.out.println("Enter your last name:");
        String last_name = input.next().trim().replace(" ", "");

        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();
                //"c" we call the upper "C" getting first character of first name

       last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

       String full_name = first_name + " " + last_name;


        System.out.println(full_name);


    /*
       This is deleted only empty space if we use ".trim();"
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first_name = input.next().trim();

        System.out.println("Enter your last name:");
        String last_name = input.next().trim();

        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();
                //"c" we call the upper "C" getting first character of first name

       last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

       String full_name = first_name + " " + last_name;



       If we want to empty every each words so se call the ".replace()" methods
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first_name = input.next().trim().replace(" ", "");

        System.out.println("Enter your last name:");
        String last_name = input.next().trim().replace(" ", "");

        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();
                //"c" we call the upper "C" getting first character of first name

       last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

       String full_name = first_name + " " + last_name;


        System.out.println(full_name);


     */









    }
}
