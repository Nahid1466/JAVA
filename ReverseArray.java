public class ReverseArray {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Array in normal order: ");

        for (int i = 0;i < arr.length;i++){
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.print("\nArray in reverse order: ");

        for (int i = arr.length - 1;i >= 0;i--){
            if (i == 0){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
