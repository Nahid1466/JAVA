import java.lang.Math;
import static java.lang.Math.log10;
import static java.lang.Math.pow;


public class number_pattern {
 public static class pera {
    public static int digits;
     public static int loop(int number) {
         int count = 0;
         while (number != 0) {
             number /= 10;
             count++;
         }

         return count;
     }

     public static int log(int num) {
         int count = (int) log10(num) + 1;
         return count;
         }

     public static int placevalue(int n){
         int pv = (int)Math.ceil(pow(10, digits - 1));
         return pv;
     }

     public static int first_digit(int num, int pv){
         int firstdigit = (int) (num / pv);
         return firstdigit;
     }

     public static int rfd(int num, int pv, int fd){
         num = num - (pv * fd);
         return num;
     }
    }
    public static void main(String[] args){

        //There are two ways to count digits of an integer.
        //Divide by 10 till number becomes 0 or log10(number) + 1
        int value = 5678;
        //System.out.println(loop(value));//printing no. of digits using while loop method
        //System.out.println(log(value));//printing no. of digits using log method
        pera np = new pera();
        while (value > 0) {
           System.out.println(value);

            np.digits = np.log(value);
           // System.out.println("Digits: " + np.digits);
           // System.out.println("PlaceValue: " + np.placevalue(np.digits));
            //System.out.println("First Digit: " + np.first_digit(value, np.placevalue(np.digits)));

            value = value - (np.placevalue(np.digits) * np.first_digit(value, np.placevalue(np.digits)));

        }

    }



}
