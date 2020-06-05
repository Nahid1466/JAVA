
import java.util.Scanner;

public class NumberToWordConverter {

    static float inputfloat(){
        float value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextFloat();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args) {
        System.out.println("Enter your amount: ");
        float value1 = inputfloat();

        int val = (int)value1;

       // System.out.println(val);

        while (10000 <= val){
            System.out.println("Enter amount less then 10000.");
            value1 = inputfloat();

            val = (int)value1;
        }

        String value = String.valueOf(value1);

        int indexofdec = value.indexOf(".");

        String intvalue = value.substring(0, indexofdec);
        String decvalue = value.substring((indexofdec+1));

        if(decvalue.length() == 1){
            decvalue = decvalue +"0";
        }

        int intnum = Integer.parseInt(intvalue);
        int decnum = Integer.parseInt(decvalue);

        while (100 <= decnum){
            System.out.println("Enter amount with two decimal digits");
            System.out.println("Enter your amount: ");
            value1 = inputfloat();

            val = (int)value1;

            while (10000 <= val){
                System.out.println("Enter amount less then 10000.");
                value1 = inputfloat();

                val = (int)value1;
            }

            value = String.valueOf(value1);

            indexofdec = value.indexOf(".");

            intvalue = value.substring(0, indexofdec);
            decvalue = value.substring((indexofdec+1));

            if(decvalue.length() == 1){
                decvalue = decvalue +"0";
            }

            intnum = Integer.parseInt(intvalue);
            decnum = Integer.parseInt(decvalue);
        }
        //System.out.println(decvalue);
        String taka = numberToWord(intnum);
        String paisa = numberToWord(decnum);


        System.out.println("Your amount in number: "+intnum+"."+decnum);
        System.out.println("Your amount in words: "+taka+" Taka and "+paisa+" Paisa");
    }

    private static String numberToWord(int number) {
        // variable to hold string representation of number
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };

        if (number == 0) {
            return "zero";
        }
        // add minus before conversion if the number is less than 0
        if (number < 0) { // convert the number to a string
            String numberStr = "" + number;
            // remove minus before the number
            numberStr = numberStr.substring(1);
            // add minus before the number and convert the rest of number
            return "minus " + numberToWord(Integer.parseInt(numberStr));
        }

        // check if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // fetch the appropriate value from unit array
                words += unitsArray[number];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }

        return words;
    }
}
