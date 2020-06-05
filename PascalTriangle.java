public class PascalTriangle {


    public static void main(String[] args){
        final int row = 10;
        int[] current = new int[row];
        int[] previous = new int[row];
        int i, j, t;

        for(i = 0;i < row;i++){
            for (j = 0;j <= i;j++){
                if (j == i || j == 0){
                    current[j] = 1;
                }else{
                    current[j] = previous[j] + previous[j-1];
                }
            }

            for (t = row;t > i;t--){
                System.out.print(" ");
            }

            for (t = 0;t <= i;t++){
                System.out.print(current[t]+" ");
                previous[t] = current[t];
            }
            System.out.print("\n");
        }


    }
}
