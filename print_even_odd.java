public class print_even_odd {

    public static class even_odd{

        public void even(){
            System.out.println("Even Numbers: ");
            for (int i = 2;i < 101;i =i+2){
                System.out.println(i);
            }
        }

        public void odd(){
            System.out.println("Odd Numbers: ");
            for (int j = 1;j < 101;j=j+2){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args){

        even_odd o = new even_odd();
        o.odd();
        o.even();

    }
}
