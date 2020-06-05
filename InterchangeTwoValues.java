public class InterchangeTwoValues {
       // public static String x = "Nahid", y = "Hasan";
        public static int x = 1466, y = 5214;

        public static class Value{
           public int p;
            Value(int x){
                this.setP(x);
            }

            public void setP(int x){
                this.p = x;

            }

            public int getP(){
                return  p;
            }

        }

        public static class Wrap{
            Value v;
            Wrap(Value v){
                this.v = v;
            }
        }

    public static void exchange(Wrap w1,
                            Wrap w2)
    {
        Value temp = w1.v;
        w1.v = w2.v;
        w2.v = temp;
    }

    public static void main(String[] args){

            int a = InterchangeTwoValues.x;
            int b = InterchangeTwoValues.y;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        System.out.println("\n");

        Value v1 = new Value(a);
            Value v2 = new Value(b);

            Wrap w1 = new Wrap(v1);
            Wrap w2 = new Wrap(v2);

            exchange(w1, w2); //desired function to interchange values among variables

            a = w1.v.getP();
            b = w2.v.getP();

            System.out.println("After exchange..");
            System.out.println("Value of a: "+a);
            System.out.println("Value of b: "+b);


    }
}
