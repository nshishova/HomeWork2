public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, traveller!");

        System.out.println("We have great news for you! Every 20 RUB you will spend on ticket, we will give 1 miles for future use!");

        int price = 17999;
        int rubPerMile = 20;
        int bonusMiles = price / rubPerMile;

        System.out.println("Collected miles: " + bonusMiles);

        System.out.println("Have a nice flight!");


    }


}
