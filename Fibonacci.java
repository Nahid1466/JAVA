import java.util.Scanner;

public class Fibonacci {

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter value of n: ");
                Scanner n = new Scanner(System.in);
                value_n = n.nextInt();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args){
        int n = input();
        int f1 = 0, f2 = 1;
        int f3;
        while (n < 1){
            n = input();
        }
        if (n == 1){
            System.out.println("Displaying the first "+n+" Fibonacci numbers.");
            System.out.println("0");
        }else {
            System.out.println("Displaying the first " + n + " Fibonacci numbers.");
            System.out.print(f1 + ", ");
            System.out.print(f2);

            for (int i = 0; i < n - 2; i++) {
                f3 = f1 + f2;
                System.out.print(", ");
                System.out.print(f3);
                f1 = f2;
                f2 = f3;

            }
        }
    }
}
