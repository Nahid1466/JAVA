import java.util.Scanner;

public class multiple {

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
        int m, n;
        int result;

        System.out.println("Enter value for m: ");
        m = input();
        System.out.println("Enter value for n: ");
        n = input();

        result = m % n;

        if(result == 0){
            System.out.println(m+" is a multiple of "+n);
        }else{
            System.out.println(m+" is not a multiple of "+n);
        }
    }
}
