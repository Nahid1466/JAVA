import java.util.Scanner;

public class Palindrome {

    static String input(){
        String value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.next();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args){

        System.out.println("Enter your text: ");
        String ptext = input();
        int len = ptext.length();
        String text = ptext.toLowerCase();
        String txt = "";

        for (int i = len - 1; i >= 0;i--){
            txt = txt + text.charAt(i);
        }

       // System.out.println(text);
        //System.out.println(txt);

        boolean result = text.equals(txt);

        if (result){
            System.out.println(ptext+" is palindrome");
        }else{
            System.out.println(ptext+" is not palindrome");
        }

    }
}
