package day07_ifStatements;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 55000,
                creditScore = 680;
        String result = "";

        if (salary >= 4500 && creditScore >= 700 ){
            result = " You are eligible for the loan";
        }else{
            result = " You are not eligible for the loan ";
        }
        System.out.println(result);







    }
}
