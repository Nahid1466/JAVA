import java.io.*;
import java.util.Scanner;

import static java.lang.Math.*;

public class QuadraticEquation {

    void findRoots(int a, int b, int c)
    {
        // If a is 0, then equation is not
        //quadratic, but linear

        if (a == 0)
        {
            System.out.println("Invalid Quadratic Equation. Value of a must be greater than 0");
            return;
        }

        int d  = b*b - 4*a*c;
        double sqrt_val = sqrt(abs(d));

        if (d > 0)
        {
            System.out.println("Roots are real and different");

            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"
                    + (double)(-b - sqrt_val) / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex");

            System.out.println( -(double)b / ( 2 * a ) + " + i"
                    + sqrt_val + "\n"  + -(double)b / ( 2 * a )
                    + " - i" + sqrt_val);
        }
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

    // Driver code
    public static void main(String args[])
    {
        QuadraticEquation obj = new QuadraticEquation();
        System.out.println("Quadratic Equation: ax^2+bx+c");
        System.out.println("Enter Value for a: ");
        int a = input();
        System.out.println("Enter Value for b: ");
        int b = input();
        System.out.println("Enter Value for c: ");
        int c = input();
        obj.findRoots(a, b, c);
    }
}
