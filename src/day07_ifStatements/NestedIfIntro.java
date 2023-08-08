package day07_ifStatements;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 300;
        if (score >= 0 && score <= 100) { // if the score is valid

            if (score >= 60) { // if the score is  greater or equal to 10
                System.out.println("Passed");
            } else { // if the score is less than
                System.out.println("Failed");
            }

        }else{ // if the score is not valid meaning
            System.out.println(" Invalid Score");
        }

        System.out.println("---------------------------");

        int age = 32;

        if (age >= 21){
            System.out.println(" Eligible");
        }else{
            System.out.println(" Not eligible");
        }



    }


}