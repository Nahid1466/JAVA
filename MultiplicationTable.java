public class MultiplicationTable {

    public static void main(String[] args){
        int i, j;
        for (i = 1;i < 11;i++){
            for (j = 1;j < 11;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
