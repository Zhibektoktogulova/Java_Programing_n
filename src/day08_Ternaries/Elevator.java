package day08_Ternaries;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 10;

        if (floorNumber >= 1 && floorNumber <= 3){
            if (floorNumber == 1){
                System.out.println(" Floor 1 selected. Companies: Cydeo , Verizon, Starbucks ");
            }else if (floorNumber == 2) {
                System.out.println(" Floor 2 selected. Companies: Cydeo, Nasa, Intelsat ");
        }else{
                System.out.println(" Floor 3 selected. Companies: Lyft, BofA, Stake House");
         }
         }else{
            System.out.println(" Invalid floor");
        }
        System.out.println("---------------------------------------------");


        String result = " Invalid floor";
        if (floorNumber >= 1 && floorNumber <= 3){
            result = " Floor "+floorNumber+" is selected. Companies:";
            if (floorNumber == 1){
                result += " Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result += " Cydeo, NASA, Intelsat";
            }else{
                result += " Lyft, BofA, Stake House";
            }
        }
        System.out.println(result);










}
}
