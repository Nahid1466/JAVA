import java.util.Scanner;

public class Prime {

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter a number: ");
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

    public static boolean IsPrime(int n){
        boolean result = true;
        for (int i = 2;i < n;i++){
            if ((n % i) == 0){
                 result = false;
            }
        }
        return result;
    }

    public static void main(String[] args){

        int n = input();
        while (n <= 1){
            System.out.println("Enter number greater then 1...");
            n = input();
        }

        boolean result = IsPrime(n);
        if (result){
            System.out.println(n+" is prime number");
        }else {
            System.out.println(n+" is not prime");
        }
    }
}
