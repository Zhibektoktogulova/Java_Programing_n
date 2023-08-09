package day08_Ternaries;

public class TernariesIntro {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int max;

        if(a > b){
            max = a;
        }else{
            max = b;
        }

        System.out.println("---------------------");



        int score = 85;
        String result = "";
        if(score >= 60){
            result = " Passed";
        }else{
            result = " Failed";

        }
        System.out.println(result);

        System.out.println("--------------------------------");
      // Ternary return
       String result2 = (score >= 60) ? " Passed" : " Failed";

        System.out.println(result2);

        System.out.println("---------------------------------");

        int age = 34;


        String r;
        if (age >= 21){
            r =" Eligible";
        }else{
            r = " Not eligible";
        }
        System.out.println(r);

        System.out.println("----------------------------------");
       // Ternary


        String result3 = (age >= 21) ? "Eligible" : " Not eligible";
        System.out.println(result3);











    }
}
 /*
 Ternary:
 ? means if, means: else

    (condition)?  :if block
    (Condition)?  : else statement
     :            : else block

  */