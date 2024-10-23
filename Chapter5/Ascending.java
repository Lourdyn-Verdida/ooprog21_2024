import java.util.Scanner;

   public class Ascending{
   public static void main(String []args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Input a number");
   int num1 = scan.nextInt();
   System.out.println("Input a number");
   int num2 = scan.nextInt();
   System.out.println("Input a number");
   int num3 = scan.nextInt();
   
   if(num1 < num2 && num2 < num3){
   System.out.print(""+num3+""+num2+""+num1);
   }else if(num1 < num2 && num3 < num2){
   System.out.print(""+num1+""+num3+""+num2);
   }else if(num2 < num1 && num1 < num3){
   System.out.print(""+num2+""+num1+""+num3);
   }else if(num2 < num1 && num3 < num1){
   System.out.print(""+num2+""+num3+""+num1);
   }else if(num3 < num2 && num1 < num2){
   System.out.print(""+num3+""+num2+""+num1);
   }else if(num3 < num1 && num2 < num1){
   System.out.print(""+num3+""+num1+""+num2);
   }else
   System.out.print(""+num1+""+num3+""+num2);
   }
}
