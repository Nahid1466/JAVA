import java.util.Scanner;

public class CaseConverter {

    static String input(){
        String value_n;
        while (true){
            try{
                System.out.println("Enter your string: ");
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

        String word = input();

        System.out.println("Your input: "+word);

        System.out.println("Converted string: "+word.toUpperCase());

    }
}
