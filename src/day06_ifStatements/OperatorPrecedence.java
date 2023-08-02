package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3 );
        //                  5 + 6 = 11

        System.out.println( 7 + 3 - 2 / 2);
        //                  7 = 3 - 1 ==> 9

        System.out.println( -5 + 3);
        //                  - 2

        System.out.println(!true == !false);
        //                  false == false

        System.out.println( 10 > 9 == 8 < 7 && " Java" == "Python " || 'a' == 'A' );
        //                   true ==   false        ||                  false







    }
}
