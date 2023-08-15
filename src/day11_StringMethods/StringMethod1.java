package day11_StringMethods;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "Java Programming";

        str1 = str1.toLowerCase(); // java programming

        System.out.println(str1);

        //-----------------------------------

       String str2 = "java programming";

        str2 = str2.toUpperCase(); // Upper case

        System.out.println(str2);

        //-----------------------------------

        String word = "Wooden Spoon";
        word = word.toUpperCase(); // "WOODEN SPOON" upper case

        word = word.toLowerCase(); // "wooden spoon"
        System.out.println(word);

        //-------------------------------------

        String str4 = "           Cydeo School"; // trim
        str4 = str4.trim();
        System.out.println(str4);

        //---------------------------------------

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s1 = "I love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf('a');
        System.out.println(secondA);


        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python");
        System.out.println(a2);

        //-----------------------------------


        String w = "Java";
        System.out.println(w.indexOf('a')); // 1

        System.out.println(w.lastIndexOf('a'));//3

     String w2 = "Java Python JavaScript Python";

     System.out.println(w2.lastIndexOf( 'a'));

     System.out.println(w2.lastIndexOf('P'));





    }
}
