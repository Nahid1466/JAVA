import java.util.Scanner;

public class Factorial {

    //recursive method
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter an integer: ");
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

    public static void main(String[] args)
    {
        int num = input();
        while(num < 1) {
            num = input();
        }
        System.out.println("Factorial of "+ num + " is " + factorial(num));
    }
}

