package day11_StringMethods;

public class StringMethods3 {
    public static void main(String[] args) {

        // isEmpty Method

        String word = "Wooden Spoon";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        //---------------------
        String str = "     ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 =" + r2);
        System.out.println("r3 = " + r3);

      //------------------------------------

      String str1 = "Cydeo";
      String str2 = new String("Cydeo");
      System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));


        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));

        //--------------------------------
         // IGNORE CASE METHOD
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));// true


        //-----------------------------------------
        // CONTAINS METHOD
        String students = "Hasa, Naran Sumeye, Natali";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);
        //--------------------------------------------
        //startsWith

        String name ="Michael";
        String url = "www.cydeo.com";
        boolean isValid = name.startsWith("www.");
        System.out.println(isValid);
        //-----------------------------------------------
        // endWith
        boolean t = url.endsWith(".com");
        System.out.println(t);

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("Yahoo.com");

        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);






    }
}
