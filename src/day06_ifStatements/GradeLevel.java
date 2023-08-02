package day06_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {

     int gradeLevel = 9;

     if (gradeLevel >=1 && gradeLevel <=5){
         System.out.println("Elementary  school");
     }
     if (gradeLevel >= 6 && gradeLevel < 8){
         System.out.println(" Middle School");
     }
     if (gradeLevel >= 9 && gradeLevel < 12){
         System.out.println(" High school");

     }
     if (gradeLevel >= 13 && gradeLevel < 16){
         System.out.println("college");
     }
     if (gradeLevel >= 17 && gradeLevel < 18){
         System.out.println(" Grade school");
     }

    }

}
/*
An integer variable named gradeLevel is declared and given, write a program to determine
and print which school type someone is in

Ex:
  gradeLevel =2

  output;
   elementary school
   The grade level any types are:
    1 ~ 5 elementary school
    6~8 Middle school
    9~ 12 High school
    13 ~ 16 college
    17~18 grade school
 */