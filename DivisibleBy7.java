import javax.security.sasl.SaslServer;

public class DivisibleBy7 {


    public  static  void main(String[] args){

        int i, count = 0;

        for (i = 101;i < 200;i++){
            if (i % 7 == 0){
                count++;
            }
        }

        int[] num = new int[count];

        int j, p, k = 0;
            for (j = 101; j < 200; j++) {
                if (j % 7 == 0) {
                    num[k] = j;
                    k++;
                    }
                }
        int sum = 0;
        System.out.println("Numbers that are greater then 100 and less then 200 and divisible by 7 are: ");
        for (p = 0;p < count;p++){
            System.out.println(num[p]);
            sum += num[p];
        }
        System.out.println("Total "+count+" Numbers found");

        System.out.println("Sum of the number: "+sum);




        //System.out.println(count);


    }
}
