package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 16;
        if (age >= 20 && age < 100){
            System.out.println(" You are eligible to buy cigarettes ");
        }
         if (age < 21 || age > 100){
             System.out.println(" You are not eligible to buy  cigarettes");

         }


    }

}
/*
A variable named age is declared and given, Write a program that can check if the person is eligible
to buy cigarettes

     Ex:
         age = 20;

      Output:
          You are not eligible to buy cigarettes

   (Single if statement only 1 output can be)
 */