package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {


        int number = 65;

        boolean isDivisibleBy2 = number % 2 == 0; // if the reminder  of the number divided by 2 is equal to zero, then its evenly divisible by2
        boolean isDivisibleBy3 = number % 2 == 0; // if the reminder  of the number divided by 3 is equal to zero, then its evenly divisible by3
        boolean isDivisibleBy5 = number % 5 == 0; // if the reminder  of the number divided by 5 is equal to zero  then its evenly divisible by5


      // boolean isDivisibleBy6 = isDivisibleBy2 && isDivisibleBy3;
        // if a number is evenly divisible by both 2,3 then the number is evenly divisible by 6

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2 );
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);

    }
}
/*
Create a class EvenlyDivisible, and write a  program that can check if a number is evenly divisible by 2, 3, 5
 Ex:
  number = 65;

  output:
   65 is divisible by 2: false
   65 is divisible by 3: false
   65 is divisible by 5: true

    Evenly Divisible ==> remainder is zero



 */