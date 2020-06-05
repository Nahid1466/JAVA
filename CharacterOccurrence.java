import java.util.Arrays;
import java.util.Scanner;

public class CharacterOccurrence {
    static String inputstring(){
        String value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextLine();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    static Character inputchar(){
        Character value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.next().charAt(0);
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static String Delete(String val, Character ch){
        int len = val.length();
       // System.out.println(len);
        char[] arr = val.toCharArray();

         System.out.println("Your String: "+val);

        for (int i = 0;i < len;i++){
            if (arr[i] == ch){
                for (int j = i;j < len - 1;j++){
                    arr[j] = arr[(j+1)];
                }
                len--;
                i--;
            }
        }
        //System.out.println(len);
        char[] newarr = new char[len];
        for (int i = 0; i < len;i++){
            newarr[i] = arr[i];
        }
        StringBuilder builder = new StringBuilder();
        for (char value : newarr) {
            builder.append(value);
        }
        String text = builder.toString();
        return text;
    }
    public static void main(String[] args){

        System.out.print("Enter a string: ");
        String value = inputstring();
        System.out.print("Enter a character(case sensitive) to remove all its occurrences from the string: ");
        Character ch = inputchar();
        //System.out.println(ch);
        String result = Delete(value, ch);

        System.out.println("String after deleting all "+ch+" : "+result);

        //have tto understand \0

    }
}
