package day12_customMethods;

public class EmailTask2 {

    public static void main(String[] args) {

        String email = "jibek_toktogul@gmail.com";

        String firstName = email.substring(0, email.indexOf("_"));
        System.out.println(firstName);

        String lastName = email.substring(email.indexOf("_") + 1,  email.indexOf("@"));
        System.out.println(lastName);

        String rest = email.substring(email.indexOf("@"));
        System.out.println(rest);
        email = firstName + "_" + lastName + rest;
        System.out.println(email);


    }
}
