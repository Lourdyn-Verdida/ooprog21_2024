public class Prelim{
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
            for(int i = 0;i<=10;i++){
                System.out.println("Fibonacci("+i+") = "+x);
                int total = x+y;
                x = y;
                y = total;
            }
    }
}

