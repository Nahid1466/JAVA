import java.util.Scanner;

public class RecursiveFibonacci {

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

    static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main (String args[])
    {
        int n = input();

System.out.println("First "+n+" fibonacci numbers are:  ");
for (int i = 0;i < n;i++)
        System.out.print(fib(i)+", ");
    }
}
