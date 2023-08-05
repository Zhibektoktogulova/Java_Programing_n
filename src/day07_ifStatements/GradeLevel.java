package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 6 ; // 1 ~18

        String result = "";

        if (gradeLevel <= 5){ // false: gradeLevel >= 6
            result = " Elementary school";
        }else if (gradeLevel >= 6 && gradeLevel < 8){
                 result = " Middle school ";
        }else if (gradeLevel <= 12) {
            result = " High school";

        }else if (gradeLevel <= 16) {
            result = " College";

        }else{
            result = " Grand School";
        }
        System.out.println(result);

    }
}
/*
Creat a class named GradeLevel
An integer variable named gradeLevel is declared any given, write a program to determinet
and print which

      Ex:
         gradeLevel = 2

         output:
         Elementary School

         The grade level any types are:

         1~5 elementary school
         6~8 Middle school
         9~12 High school
         13~16 College
         17~18 Grade School

         Note: Assume that the given number is between 1 ~ 18

 */