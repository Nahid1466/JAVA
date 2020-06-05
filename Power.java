import java.util.Scanner;

public class Power {

    static int input(){
        int value_n;
        while (true){
            try{
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
        System.out.println("Evaluating the following equation: y = x^n.");
        System.out.println("Enter value of x: ");
        int x = input();
        System.out.println("Enter value of n, which is power of x: ");
        int n = input();
        while (n < -1){
            System.out.println("Please enter a non-negetive value for n.");
            n = input();
        }

        System.out.println("Value of y is: "+Math.pow(x, n));
    }
}
