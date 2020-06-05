import java.util.Scanner;

public class EulersNumber {

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
        System.out.println("Enter value of n: ");
        int num = input();
        while (num < 1){
            System.out.println("Enter a valid value of n: ");
            num = input();
        }

        double e = 1;

            for (int i = 1; i <=num; i++){
                e = e + (1.0 / factorial(i));
            }


        System.out.println("Value of Euler's number is: "+e);

    }
}
