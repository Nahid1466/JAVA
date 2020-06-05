import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class AlphaOrder {

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

        public static void main(String args[])
        {
            System.out.println("Enter a string : ");
            String userInput = input();
            //1
            Character[] charArray = new Character[userInput.length()];
            for (int i = 0; i < userInput.length(); i++) {
                charArray[i] = userInput.charAt(i);
            }
            //2
            Arrays.sort(charArray, Comparator.comparingInt(Character::toLowerCase));
            StringBuilder sb = new StringBuilder(charArray.length);
            for (Character c : charArray)
                sb.append(c.charValue());

            System.out.println("Sorted string " + sb.toString());
        }

}

//have to understand this properly
    //Java 8 stream API provides one beautiful way to solve this problem.
        /*import java.util.Comparator;
                import java.util.Scanner;
                import java.util.stream.Collectors;
                        import java.util.stream.Stream;
        class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a string : ");
                String userInput = scanner.nextLine();
                String finalString =
                        Stream.of(userInput.split(""))
                                .sorted(Comparator.comparingInt(o -> Character.toLowerCase(o.charAt(0))))
                                .collect(Collectors.joining());
                System.out.println("Sorted string " + finalString);
            }
        }*/


