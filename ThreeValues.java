import java.util.Scanner;

public class ThreeValues {

    public static class Values{
        private float a, b, c;

        //getting values using constructor
        /*Values(){
            this.setA(0);
            this.setB(0);
            this.setC(0);
        }*/
        Values(float x, float y, float z){
            this.setA(x);
            this.setB(y);
            this.setC(z);
        }

        //setter
        private void setA(float x){
            this.a = x;
        }
        private void setB(float y){
            this.b = y;
        }
        private void setC(float z){
            this.c = z;
        }

        //getter
        public float getA(){
            return a;
        }
        public float getB(){
            return b;
        }
        public float getC(){
            return c;
        }
    }

    public static class Operation{

        public float sum(float a, float b, float c){
            return a + b + c;
        }
        public float avg(float a, float b, float c){
            return (a + b + c) / 3;
        }
        public void large(float a, float b, float c){
            if(a > b){
                if(a > c){
                    System.out.println("Largest number among three is: "+a);
                }else{
                    System.out.println("Largest number among three is: "+c);
                }
            }else{
                if(b > c){
                    System.out.println("Largest number among three is: "+b);
                }else{
                    System.out.println("Largest number among three is: "+c);
                }
            }
        }

        public void small(float a, float b, float c){
            if(a < b){
                if(a < c){
                    System.out.println("Smallest number among three is: "+a);
                }else{
                    System.out.println("Smallest number among three is: "+c);
                }
            }else{
                if(b < c){
                    System.out.println("Smallest number among three is: "+b);
                }else{
                    System.out.println("Smallest number among three is: "+c);
                }
            }
        }
    }

    static float input(){
        float value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextFloat();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static void main(String[] args){
        float p, q, r;
        System.out.println("Enter 1st value: ");
        p = input();
        System.out.println("Enter 2nd value: ");
        q = input();
        System.out.println("Enter 3rd value: ");
        r = input();

        Values v = new Values(p, q, r);

        Operation o = new Operation();

        System.out.println("Sum of three value is: "+o.sum(v.getA(), v.getB(), v.getC()));
        System.out.println("Average of three value is: "+o.avg(v.getA(), v.getB(), v.getC()));
        o.large(v.getA(), v.getB(), v.getC());
        o.small(v.getA(), v.getB(), v.getC());
    }
}
