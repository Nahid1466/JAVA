import java.io.*;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AppendsSum {

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

        try{
            //writing into file using file writer
            FileWriter fw=new FileWriter("/home/user/IdeaProjects/p50/src/text.txt");
            System.out.println("How many numbers you want to write in the file: ");
            int num = inputint();

            System.out.println("Enter numbers: ");
            for (int i = 0; i < num;i++) {
                int v = inputint();
                String value = Integer.toString(v);
                if (i == num -1){
                    fw.write(value);
                }else{
                    fw.write(value);
                    fw.write(",");
                }

            }
            fw.flush();
           fw.close();

           //reading using random access file
            RandomAccessFile raf = new RandomAccessFile("/home/user/IdeaProjects/p50/src/text.txt", "r");

            long position = raf.length();

            //System.out.println(position);
            int offset = 0;
            //int[] arr = new int[(int)position];
            StringBuilder val = new StringBuilder();

            for (int i = offset; i < position;i++){

                raf.seek(i);
                byte b = raf.readByte();

                //System.out.print((char) b);
                char a = (char) b;
                val.append(a);
                //arr[i] = Character.getNumericValue(a);
            }
            //System.out.println("Result: "+val);
            String nval = val.toString();
            String[] cut = nval.split(",");
            //System.out.println("Result: "+cut[2]);
            int sum = 0;
            int[] arr = new int[num];
            for (int i = 0; i < num;i++){
                arr[i] = Integer.parseInt(cut[i]);
                sum = sum + arr[i];
            }
            String res = Integer.toString(sum);
            String result = ","+res;

            //System.out.println(result);

            //again over writing and append using file output stream
            FileOutputStream fos = new FileOutputStream("/home/user/IdeaProjects/p50/src/text.txt", true);
            fos.write(result.getBytes());
            fos.close();

            File file = new File("/home/user/IdeaProjects/p50/src/text.txt");

            //reading file using scanner
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());

            //System.out.println(raf.length());

        }catch(Exception e){System.out.println(e);}
    }
}
