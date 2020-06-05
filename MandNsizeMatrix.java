import java.util.Scanner;

public class MandNsizeMatrix {

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

    public static void ProductOfMatrices(int m, int n, int[][] matA, int[][] matB){
        int[][] Result = new int[10][10];

        System.out.println("Matrix A is: ");

        for (int i = 0; i < m;i++){
            for (int j = 0;j < n;j++){
                System.out.print(matA[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix B is: ");

        for (int i = 0; i < n;i++){
            for (int j = 0;j < m;j++){
                System.out.print(matB[i][j]+" ");
            }
            System.out.print("\n");
        }

        int[][] mulArr = new int[10][10];
        int sum = 0;

        for (int i = 0;i < m;i++){
            for (int j = 0; j < m;j++){
                for (int k = 0;k < n;k++){
                    sum = sum + (matA[i][k] * matB[k][j]);
                }

                mulArr[i][j] = sum;
                sum = 0;
            }
        }

        System.out.println("Result: ");
        for (int i = 0;i < m;i++){
            for (int j = 0;j < m;j++){
                System.out.print(mulArr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number of rows and columns of matrix: ");
        int r1 = input();
        int c1 = input();
        int[][] A = new int[10][10];

        System.out.println("Enter the elements of first matrix: ");

        for (int i = 0; i < r1;i++){
            for (int j = 0;j < c1;j++){
                System.out.println("Enter value for row "+(i+1)+" and column "+(j+1));
                A[i][j] = input();
            }
        }



        //System.out.println("Enter the number of rows and columns of matrix B: ");
        int r2 = c1;
        int c2 = r1;
            System.out.println("Second matrix has "+c1+" rows and "+r1+" columns.");
            System.out.println("Enter the elements of second matrix: ");
            int[][] B = new int[10][10];

            for (int i = 0; i < r2;i++){
                for (int j = 0;j < c2;j++){
                    System.out.println("Enter value for row "+(i+1)+" and column "+(j+1));
                    B[i][j] = input();
                }
            }

        ProductOfMatrices(r1, c1, A, B);

    }
}
