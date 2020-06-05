import java.util.Scanner;

public class MyClass {

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

    public static void main(String[] args) {
    int num, sum = 0;
    float average;
        System.out.println("Enter set N elements number: ");
    num = input();

    while (num < 2){
        System.out.println("Seriously! Enter the numbers you cant't calculate");
        num = input();
    }
   // System.out.println(num);
        System.out.println("Enter values of set N");
        int arr[] = new int[num];
        for (int i = 0; i < num; i++){
            arr[i] = input();
            sum += arr[i];
        }
       // System.out.println(num);

        System.out.println("Sum:"+sum);

        average = (float)sum / num;

        System.out.println("Average:"+average);
    }
}


