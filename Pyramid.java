public class Pyramid {

    public static void main(String[] args){
        String num = "123456789";
        int len = num.length() / 2;
        int count;
        //int space = len - 1;

        for (int i = 0;i <= len;i++){
            count = i;
            for (int j = len; j > i;j--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i;j++){
                System.out.print(num.charAt(count));
                count++;
            }
            count--;
            count--;
            for (int j = 0;j < i;j++){
                System.out.print(num.charAt(count));
                count--;
            }
            System.out.print("\n");
        }
    }

}
