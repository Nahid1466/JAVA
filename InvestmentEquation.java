import java.io.*;
import java.util.Scanner;

public class InvestmentEquation {

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter a valid number of year: ");
                Scanner n = new Scanner(System.in);
                value_n = n.nextInt();
                System.out.flush();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String args[])
    {
        int p = 1000;     //Intial Principal Amount
        float r = 0.10f;  //Intial Interest Rateint
        int n = input();
        double V = 0.0;

        while (n < 1){
            n = input();
        }

        System.out.println("\n=====COMPOUND INTEREST CALCULATION=====");

        System.out.print("Principal Amount : ");
        System.out.flush();
        for(int i=1;i<=n;i++)
        {

            System.out.print("      "+p);
            p=p+1000;
        }

        System.out.print("\nInterest Rate    : ");
        System.out.flush();
        for(int i=1;i<=n;i++)
        {
            System.out.print("      "+r);
            r=r+0.01f;
        }

        System.out.println("\nNo. of yrs ");

        int principle = 1000;
        float rate = 0.10f;

        for(int i=1;i<=n;i++)
        {
            System.out.print("       "+i+"            ");
            System.out.flush();
            for(int j=1;j<=n;j++)
            {
                V = principle * Math.pow(1+rate, i);
                V = Math.floor(V);
                System.out.print("    "+V);
                principle = principle + 1000;
                rate = rate + 0.01f;

            }
            principle  = 1000;
            rate = 0.10f;
            System.out.println();
        }




    }
}
