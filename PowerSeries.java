import java.util.Scanner;

public class PowerSeries {

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

    public static float exponential(int n, float x){

        float sum = 1;

        for (int i = n; i > 0;i--){
            sum = 1 + x * sum / i;
        }

        return sum;

    }

    public static void main(String[] args){
        System.out.println("Enter value of n: ");
        int n = input();
        while (n < 0){
            System.out.println("Enter a positive integer.");
            n = input();
        }
        float x = 1;
        System.out.println("e^x: "+exponential(n, x));
    }


}
