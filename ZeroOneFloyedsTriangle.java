import java.util.Scanner;

public class ZeroOneFloyedsTriangle {

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

        System.out.println("Input number of rows for Floyd's Triangle: ");
        int n = input();
        while(n < 1){
            System.out.println("Enter number greater then 0");
            n = input();
        }

        for(int i = 1; i <= n;i++){
                for (int j = 1; j <= i; j++) {
                    if ((i+j) % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
            }

            System.out.print("\n");
        }

    }

}

