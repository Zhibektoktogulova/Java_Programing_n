package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 45000;
        int creditScore = 700;
        int age = 42;


        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >=18;// both conditions good because we use &&
                                   // true         &&   true            && true
        System.out.println(eligibleForLoan);

        System.out.println("-------------------------------------------");

        age = 18;
        String country = "USA";
        boolean eligibleForVote = age >= 18 && country =="USA";
        //                           true      &&    false
        System.out.println(eligibleForVote);

        System.out.println("----------------------------------------");

        country = "Australia";
        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "UK" || country == "Australia";
        //                               false             ||  false           ||  false         || true
        System.out.println("nativeEnglishSpeaker = " + nativeEnglishSpeaker);


        System.out.println("-------------------------------------------");

         String answer = "yes";
         boolean validAnswer = answer == "yes" || answer == "No";
        System.out.println("validAnswer = " + validAnswer);
        System.out.println(validAnswer);


        System.out.println("-------------------------------------------");

        char grade = 'A';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade =='D';

        System.out.println(passedTheExam);


        System.out.println("-------------------------------------------");
        // ! Logical Not    "All logical operators return Boolean false or true"

        System.out.println(!true );

        String a = "yes";

        boolean yes = a == "yes"; // true

        boolean no = !yes; // false
        System.out.println("no = " + no);
        System.out.println("yes = " + yes);

        System.out.println("-------------------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


        System.out.println("-------------------------------------------");

        System.out.println( true == !false && false == !true && true != !true);
        //                   true          &&     true       &&    false



    }
}
