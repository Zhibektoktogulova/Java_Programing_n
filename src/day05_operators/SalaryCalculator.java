package day05_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate =45,
                weeklyHours = 40;
        double stateTaxRate =  6; // implicit casting

        double federalTaxRate = 25.5;

//-----------------------------------------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax * stateTaxRate / 100;

        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        double totalTax = stateTax * federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);







       /*
       1.2 use the given info in above variables to calculate the followings:

         1. salaryBeforeTax
         2. stateTax
         3. federalTax
         4.totalTax
         5.salaryAfterTax
         Hint:salaryBeforeTax = hourlyRate * weeklyHour * 52

         1.3 use print statement to print each of the above

          Ex: hourlyRate = $50
              weeklyHours = 45
              stateTaxRate = 6(given as percentage, you need to convert to decimal)
              federalTax = 26 (given as percentage, you need to convert to decimal) / decimal is "/"

              output:

              Gross pay is:$117000
              Federal tax is :$30420
              State tax is: $7020
              Total tax is: $37440
              Net income is: 79560

              arithmetic operators: +, -, *, /, %,
        */






    }


}