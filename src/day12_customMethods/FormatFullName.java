package day12_customMethods;

public class FormatFullName {

    public static void main(String[] args) {

        String first_name = "cyDEO";
        String last_name = "sCHOOL";

        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();
                //"c" we call the upper "C" getting first character of first name

       last_name = last_name.substring(0,1).toUpperCase() + last_name.substring(1).toLowerCase();

       String full_name = first_name + " " + last_name;


        System.out.println(first_name);
        System.out.println(last_name);
        System.out.println(full_name);












    }
}
