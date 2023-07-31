package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {


        String name = "Azamat Amankulov";
        int buildingNumber = 6222;
        String streetName = "Fountain Ave";
        String city = "Los Angeles";
        String state = "California";
        int zipCode = 90028;

        System.out.println("Your Shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t" + buildingNumber + " " + streetName);
        System.out.println("\t" + city + ", " + state + " " + zipCode);

        System.out.println("-----------------------------------------");

        System.out.println("Your Shipping address is:\n\t" +name +"\n\t" + buildingNumber +
                 " " + streetName +"\n\t"+ city + ", " + state + " " + zipCode);




    }
}
