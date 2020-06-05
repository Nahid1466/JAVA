import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.cos;

// JAVA code for implementing sin function

class SinCos {

    static float input(){
        float value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextFloat();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    static final double PI = 3.1416;

    // Function for calculating sin value
    static void cal_sin(float n)
    {
        float accuracy = (float)0.00001;
        float denominator, sinx, sinval;

        // Converting degrees to radian
        n = n * (float)(PI / 180.0);

        float x1 = n;

        // maps the sum along the series
        sinx = n;

        // holds the actual value of sin(n)
        sinval = (float)sin(n);
        //System.out.println(sinval);
        int i = 2;
        do
        {
            denominator =  i * (i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 2;
        } while (accuracy <= Math.abs(sinval - sinx));
        System.out.println(sinx);
        System.out.flush();
    }

    static void cal_cos(float n)
    {
        float accuracy = (float)0.0001;
        float denominator, cosx, cosval;

        // Converting degrees to radian
        n = n * (float)(PI / 180.0);

        float x1 = 1;

        // maps the sum along the series
        cosx = 1;

        // holds the actual value of cos(n)
        cosval = (float)cos(n);
        //System.out.println(cosval);
        int i = 1;
        do
        {
            denominator =  i * (i + 1);
            x1 = -x1 * n * n / denominator;
            cosx = cosx + x1;
            i = i + 2;
        } while (accuracy <= Math.abs(cosval - cosx));
        System.out.println(cosx);
        System.out.flush();
    }

// Main function


    public static void main(String[] args) {

        System.out.println("Evolution of sin(x) and cos(x) function.");
        System.out.println("1. Sin(x)\n2. Cos(x)\nEnter menu no.");

        int menu = (int) input();

        while (!(menu == 1 || menu == 2)){
            System.out.println("Please enter a valid number from menu");
            menu = (int)input();
        }

        switch (menu){
            case 1:
                System.out.println("Enter value of x in degree to evolute sin(x): ");
                float x = input();
                while (0 > x){
                    System.out.println("Degree cannot be negative");
                    x = input();
                }
                System.out.print("Sin( "+x+" ):  ");
                cal_sin(x);

                break;


            case 2:
                System.out.println("Enter value of x in degree to evolute cos(x): ");
                x = input();
                while (0 > x){
                    System.out.println("Degree cannot be negative");
                    x = input();
                }
                System.out.print("Cos( "+x+" ):  ");
                cal_cos(x);
               // System.out.flush();

                break;
        }

    }
}
