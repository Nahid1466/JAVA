import java.util.Scanner;

public class four_digit_int {

    static int input(){
        int value_n;
        while (true){
            try{
                System.out.println("Enter four digit integer: ");
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
        int i;
        int sum = 0;
        int yourInput;
        yourInput = input();
        String temp = Integer.toString(yourInput);

            while (!(temp.length() == 4)){
               yourInput = input();
                temp = Integer.toString(yourInput);
            }

        int[] arr = new int[temp.length()];
        for(i = 0;i < temp.length();i++){
            arr[i] = Character .getNumericValue(temp.charAt(i));
            sum += arr[i];
        }

        System.out.println("Sum of digits: "+sum);
    }
}


