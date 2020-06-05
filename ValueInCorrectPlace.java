import java.util.Scanner;

public class ValueInCorrectPlace {

    static int inputint(){
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
        System.out.println("Enter the number of elements in array: ");
        int num = inputint();
        int[] arr = new int[20];

        System.out.println("Enter the elements: ");

        for(int i = 0; i < num;i++){
            arr[i] = inputint();
        }
        int temp = 0;
        //sorting
        for (int i = 0;i < num;i++){
            for (int j = i+1; j < num;j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0;i < num;i++){
            if (i == num - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }

        System.out.println("Enter a new value to insert in the array in correct position: ");
        int value = inputint();
        arr[num] = value;
        num = num + 1;

        for (int k = 0;k < num;k++){
            for (int j = k+1; j < num;j++){
                if (arr[k] > arr[j]){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0;i < num;i++){
            if (i == num - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}
