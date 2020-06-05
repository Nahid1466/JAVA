public class MatrixTriangle {

     public static void main(String[] args){

         int[][] arr = new int[10][10];
         int c = 4, n;
         for (int i = 0;i < 5;i++){
             n = 0;
             for (int j = 0;j < 5;j++){
                 if (c == j){
                     arr[i][j] = 0;
                     n = 1;
                     c--;
                 }else {
                     switch (n){
                         case 0:
                             arr[i][j] = 1;
                             break;
                         case 1:
                             arr[i][j] = -1;
                     }
                 }
             }
         }

         for (int i = 0;i < 5;i++){
             for (int j = 0;j < 5;j++){
                 System.out.print(arr[i][j]+"\t");
             }
             System.out.print("\n");
         }
     }
}
