import java.util.Scanner;

public class SammysRentalPrice{

public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    System.out.println("S Sammys makes it fun in the sun. S");
    System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    System.out.println("Number of Minutes to Rent the equipment: ");
    int minsRented = scan.nextInt();
    int hour = minsRented / 60;
    int mins = minsRented % 60;
    int totalRented = hour * 40 + mins;
    System.out.println("The total price of the equipment used is:$"+totalRented);
}
}
