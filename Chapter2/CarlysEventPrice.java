import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("* Carly's makes food that makes *");
        System.out.println("*            it a party         *");
        System.out.println("*********************************");
        System.out.println("How many guests will attend?: ");
        int guestsNum = scan.nextInt();
        System.out.println("Number of guests: "+guests);
        int total = 35*guestsNum;
        System.out.println("Price per guests is $35");
        System.out.println("Total price is: $" +total);
        if(guestsNum>=50){
            System.out.println("\nThe event is classified as a big event");
        }
        else
            System.out.println("\nThe event is classified as a small event");
    }
    
}
