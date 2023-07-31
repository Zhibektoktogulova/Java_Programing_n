package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment / decrement

        int x = 10;

        System.out.println( ++x); //11 Increase
        System.out.println(++x);


        int y = 100;
        System.out.println(--y ); //99 Decrease
        System.out.println(y); //99


        System.out.println("----------------------------------");

        // post increment / decrement

        int a = 50;
        System.out.println(a++); //50
        System.out.println(a); //51


        int c = 25;
        System.out.println(c--); // 25
        System.out.println(c);   //24

        System.out.println("------------------------------");

        int n = 30;
        int m = n++;  // m = 30, n = 31

        System.out.println("n = " + n);
        System.out.println("m = " + m);


        int z = 60;

        int q = z--; // q = 60, z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);

















    }





}
