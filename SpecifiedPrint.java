import java.io.RandomAccessFile;
import java.util.Scanner;

public class SpecifiedPrint {

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

    static int inputint(){
        int value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextInt();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args){
        try {

            System.out.println("Enter file name: ");
            String fname = inputstring();

            RandomAccessFile raf = new RandomAccessFile("/home/user/IdeaProjects/p49/src/"+fname+".txt", "r");

            long position = raf.length();

            //System.out.println(position);
            System.out.println("Enter offset value: ");
            int offset = inputint();

            for (int i = offset; i < position;i++){

                raf.seek(i);
                byte b = raf.readByte();

                System.out.print((char) b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
