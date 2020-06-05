import java.util.Scanner;

public class InventorOfC {

    static String input(){
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


    public static void main(String[] args){
        String c = "Dennis Ritchie";

        String c1 = c.toUpperCase();

        System.out.println("Who is the inventor of C?");

        boolean value;
        int count = 0;

            String name = input();

            String name1 = name.toUpperCase();

            value = c1.equals(name1);

        while (!value && count < 2){
            System.out.println("try again");
            name = input();

            name1 = name.toUpperCase();

            value = c1.equals(name1);

            count++;
        }

        if (!value){
            System.out.println("Correct answer: "+c);
        }else{
            System.out.println("\ngood");
        }


    }
}
