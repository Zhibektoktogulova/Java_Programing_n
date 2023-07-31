package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        // Assignment Shorthand Operators
        int a = 20;

        System.out.println(a); // 20

        System.out.println(a); // 20

        a = 40;

        System.out.println(a); // 40

        a = 90;

        System.out.println(a); //90

        System.out.println("----------------------------------");
        // Addition  Assignment Shorthand Operators

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("balance = " + balance); // balance 1100.0

        balance += 500; // balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;

        System.out.println("balance = " + balance);

        balance -= 1000; // balance = 11600 - 1000

        System.out.println("balance = " + balance);

        balance -= 5000;

        System.out.println("balance = " + balance);

        System.out.println("---------------------------------");
        // Subtraction Assignment Shorthand Operators

        double salary = 45000;

        salary *= 2; // salary = 4500 * 2

        System.out.println(salary);

        salary *= 3;
        System.out.println(salary);

        System.out.println("-----------------------------------");


        double eth = 4;

         eth *= 1000;

        System.out.println(eth);

        System.out.println("-----------------------------------");
        // Division Assignment

        eth /= 2;

        System.out.println("doge = " + eth);

        System.out.println("----------------------------------");

        System.out.println("salary = " + salary);

        salary /=2;

        System.out.println(salary);


        System.out.println("------------------------------");
        //Remainder Assignment


        int b = 35;

        b %= 7; // b = 35% 7

        System.out.println(b);













    }
}
