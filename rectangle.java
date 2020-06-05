import java.util.Scanner;

public class rectangle {

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

    public static void area(float l, float w){
        float a = l * w;
        System.out.println("Area: "+a);

    }

    public static void perimeter(float l, float w){
        float p = 2 * (l + w);
        System.out.println("Perimeter: "+p);
    }

    public static void main(String[] args){
        float l, w;
        System.out.println("Enter length of a rectangular: ");
        l = input();
        while ((int) l < 0){
            System.out.println("Length cannot be negetive");
            l = input();
        }
        System.out.println("Enter Width of a rectangular: ");
        w = input();
        while ((int) w < 0){
            System.out.println("Width cannot be negetive");
            w = input();
        }

        area(l, w);
        perimeter(l, w);
    }
}
