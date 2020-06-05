import java.util.Scanner;

public class ReverseTheDigit {

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter five digit integer: ");
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
        int remainder, reversenumber = 0;
        int yourInput;
        yourInput = input();
        String temp = Integer.toString(yourInput);

        while (!(temp.length() == 5)){
            yourInput = input();
            temp = Integer.toString(yourInput);
        }
        while (yourInput % 10 != 0){
            remainder = yourInput % 10;
            reversenumber = reversenumber * 10 + remainder;
            yourInput /= 10;
        }

        System.out.println("Your reversed five digit number is: "+reversenumber);
    }
}
