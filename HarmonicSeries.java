import java.util.Scanner;

public class HarmonicSeries {

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

        static double sum(int n)
        {
            double i, s = 0.0;
            for (i = 1; i <= n; i++)
                s = s + 1/i;
            return s;
        }

        public static void main(String args[])
        {
            System.out.println("Enter value of n: ");
            int n = input();
            System.out.printf("Sum is %f", sum(n));

        }

}
