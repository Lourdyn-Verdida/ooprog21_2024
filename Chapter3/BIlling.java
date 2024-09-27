public class Billing{
   public static void main(String[]args){
   double price = 23.2;
   int quantity = 2;
   int couponDis = 3;
   computeBill(price);
   computeBill(price,quantity);
   computeBill(price,quantity,couponDis);
   }
   public static void computeBill(double price){
   double totalPrice = (price * 0.08) + price;
   System.out.println("The total price is $"+totalPrice);
   }
   public static void computeBill(double price,int quantity){
   double totalPrice = ((price * 0.08) + price)*quantity;
   System.out.println("The total price is $"+totalPrice);
   }
   public static void computeBill(double price,int quantity,int couponDis){
   double discountVal = ((price * 0.08) + price)*0.12;
   double discountQuan = discountVal * couponDis;
   double totalPrice = (((price * 0.08) + price)*quantity)-discountQuan;
   System.out.println("The total price is $"+totalPrice);
   }

   }

   
}
