import java.util.Scanner;

public class even_odd_determinator {
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
        System.out.println("Enter an integer number: ");
        int value = input();

        int result;

        result = value % 2;

        if(result == 0){
            System.out.println(value+" is Even");
        }else {
            System.out.println(value+" is Odd");
        }
    }
}
