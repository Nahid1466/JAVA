import java.io.*;

public class CopyFileContent{
    public static void main(String args[]) throws IOException{
        File fileName = new File("/home/user/IdeaProjects/p48/src/text.txt");

        FileInputStream inFile = new FileInputStream("/home/user/IdeaProjects/p48/src/text.txt");
        int fileLength =(int)fileName.length();

        byte[] Bytes =new byte[fileLength];

        inFile.read(Bytes);

        String file1 = new String(Bytes);
        System.out.println("File content is:\n" + file1);

        FileOutputStream outFile = new FileOutputStream("/home/user/IdeaProjects/p48/src/text1.txt");

        for (int i = 0; i<fileLength; i++)
        {
            outFile.write(Bytes[i]);
        }

        System.out.println("File copied.");
        //close files
        inFile.close();
        outFile.close();
    }
}