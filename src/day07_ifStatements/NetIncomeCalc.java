package day07_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 115000;
        boolean isMarried = true;

        double taxRate = 0;

        if (salary >= 130000){ // if the salary is 130k or more, then the tax rate should be 35%
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000){// if the salary is between 100k to 130k (excluded) then the tax rate should be 30%
            taxRate = 0.3;

        }
        if (salary >= 80000){ // if the salary is between 80k to 100k (excluded), then the tax rate should be 30%
            taxRate =0.25;

        }
        if (salary >= 79000){
            taxRate = 0.2;
        }
        if (isMarried){
            taxRate -= 0.05;// the tax is reduced by 5%
        }
        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;
        
        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        // System.out.println(taxRate);
    }
}
/*
Create a class named NetIncomeCalc write a program that can calculate the salary after  tax
based on the following requirements

     tax rates are:

         35% for salary of 130K or more
         30% for salary of 100K to 129k
         25% for salary of 80k to 90k
         20% for salary of 79k to less

         in addition:
          if the person is married he/she will pay 5% less taxes
 */