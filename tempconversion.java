import java.util.Scanner;

public class tempconversion {

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

    public static void main(String[] args){
        int menu;
        float celsius, fahrenheit, result = 0;
        System.out.println("Welcome to temperature conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.println("Enter menu number:");
        menu = (int)input();
        while (!(menu == 1 || menu == 2)){
            System.out.println("Please enter a valid number from menu");
            menu = (int)input();
        }

        switch (menu){
            case 1:
                System.out.println("Enter temperature in Celsius:");
                celsius = input();
                result = (float) ((celsius * 1.8) +32);
                System.out.println("Temperature in fahrenheit:"+result);

                break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                fahrenheit = input();
                result = (float) ((fahrenheit -32) / 1.8);
                System.out.println("Temperature in Celsius:"+result);

                break;

            default:


        }
    }
}
