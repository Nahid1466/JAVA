
import java.util.Scanner;
import java.util.Vector;

public class VectorOps {

    static int input(){
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

        //creating a vector
        System.out.println("Enter number of co-ordinates: ");
        int co = input();
        Vector v1 = new Vector();

        for (int i = 0;i < co;i++){
            System.out.println("Enter Coordinate no "+(i+1));

            v1.add(input());
        }

        System.out.println("Vector: "+v1);

        //modify the value of given element

        System.out.println("Modification of vector. Select from menu: \n" +
                "1. Add more values.\n2. Remove a value\n" +
                "3. Replace value\n4. Skip operations");

        int m = input();

        switch (m){
            case 1:
                v1 = add(v1);
                co++;
                break;
            case 2:
                v1 = remove(v1);
                break;
            case 3:
                v1 = replace(v1);
            case 4:
                break;
        }

        System.out.println("Vector after modification: "+v1);

        //multiply by a scalar value
        System.out.println("Enter a scalar number to multiply: ");
        int num = input();
        int temp = 0;
        //System.out.println(v1.elementAt(0));
        for (int i = 0;i < co;i++){
            temp = (int) v1.elementAt(i);
            v1.set(i, (temp * num));

        }

        System.out.println("Vector after scalar multiplication: "+v1);//Displaying the vector in vector form

        Vector v2 = new Vector();
        System.out.println("Enter second vector of "+co+" coordinates: ");
        for (int i = 0;i < co;i++){
            System.out.println("Enter value for Coordinate no "+(i+1));

            v2.add(input());
        }

        System.out.println("2nd Vector: "+v2);

        Vector v3 = new Vector();

        v3 = Vectoraddition(v1, v2, co);

        System.out.println("Sum of two vectors: "+v3);
    }

    public static Vector Vectoraddition(Vector a, Vector b, int c){
        Vector v = new Vector();
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0;i < c;i++){
            temp1 = (int) a.elementAt(i);
            temp2 = (int) b.elementAt(i);
            v.add((temp1+temp2));
        }

        return v;
    }

    public static Vector replace(Vector v){
        System.out.println("Enter index no to replace value: ");
        int i = input();
        System.out.println("Enter value: ");
        int e = input();

        v.set(i, e);

        return v;

    }

    public static Vector add(Vector v){
        System.out.println("Enter index no. to add valu: ");
        int i = input();
        System.out.println("Enter value: ");
        int e = input();

        v.add(i, e);

        return v;

    }

    public static Vector remove(Vector v){
        System.out.println("Enter index no to remove value: ");
        int i = input();

        v.remove(i);

        return v;

    }
}
