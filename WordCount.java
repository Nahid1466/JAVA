import java.util.Scanner;

public class WordCount {

    static String text(){
        String t;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                t = n.nextLine();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return t;
    }

    static String word(){
        String w;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                w = n.next();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return w;
    }

    public static void main(String[] args){

        System.out.println("Enter the text: ");
        String ptext = text();
        String text = ptext.toUpperCase();
        System.out.println("Enter word to count: ");
        String pword = word();
        String word = pword.toUpperCase();
        String word1 = word+".";
        String word2 = word+",";

        String[] text1;
        text1 = text.split(" ");

        int count = 0;

        for (int i = 0;i < text1.length;i++){
                if (word.equals(text1[i]) || word1.equals(text1[i]) || word2.equals(text1[i])){
                    count++;
                }
        }

        System.out.println(pword+" found "+count+" times in the text.");

    }
}
