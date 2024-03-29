package day12_custumerMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Hello !   \nSplit or No split  ");

        String getSplitOrNotSplit = in.next().toLowerCase();
        System.out.println("Please enter the amount of people");

        int amountOfUsers = in.nextInt();
        System.out.println("Please enter the check amount ");
        double checkAmount = in.nextDouble();

        System.out.println("How was the service ");
        String service = in.next().toLowerCase();


        double totalTip = (service.equals("excellent"))? checkAmount * 0.25
                        :(service.equals("great"))? checkAmount * 0.2
                        :(service.equals("good"))? checkAmount * 0.15
                        :(service.equals("fair"))? checkAmount * 0.1
                        : checkAmount * 0.05;


        double totalToPay = amountOfUsers + totalTip;

        System.out.println("Number of people: " + amountOfUsers );
        System.out.println("Total to pay : " + totalToPay);
        System.out.println("Total tip:  " + totalTip );

        if(getSplitOrNotSplit.equals("yes")){
            System.out.println("Total per Person: " + (totalToPay/ amountOfUsers));
            System.out.println("Total tip: "   + (totalTip/ totalToPay));

        }






















    }
}
