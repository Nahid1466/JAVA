import java.util.Scanner;

public class Matrix {

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
        System.out.println("Enter the number of rows and columns of matrix A: ");
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



        System.out.println("Enter the number of rows and columns of matrix B: ");
        int r2 = input();
        int c2 = input();

        if (c1 != r2){
            System.out.println("The matrices can not be multiplied with each other");
        }else {
            int[][] B = new int[10][10];

            for (int i = 0; i < r2;i++){
                for (int j = 0;j < c2;j++){
                    System.out.println("Enter value for row "+(i+1)+" and column "+(j+1));
                    B[i][j] = input();
                }
            }



            int[][] mulArr = new int[10][10];
            int sum = 0;

            for (int i = 0;i < r1;i++){
                for (int j = 0; j < c2;j++){
                    for (int k = 0;k < r2;k++){
                        sum = sum + (A[i][k] * B[k][j]);
                    }

                    mulArr[i][j] = sum;
                    sum = 0;
                }
            }

            System.out.println("Matrix A is: ");

            for (int i = 0; i < r1;i++){
                for (int j = 0;j < c1;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.print("\n");
            }

            System.out.println("Matrix B is: ");

            for (int i = 0; i < r2;i++){
                for (int j = 0;j < c2;j++){
                    System.out.print(B[i][j]+" ");
                }
                System.out.print("\n");
            }

            System.out.println("Result: ");
            for (int i = 0;i < r1;i++){
                for (int j = 0;j < c2;j++){
                    System.out.print(mulArr[i][j]+"\t");
                }
                System.out.print("\n");
            }

        }

    }
}
