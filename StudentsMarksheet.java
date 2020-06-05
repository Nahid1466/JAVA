import java.util.Scanner;

public class StudentsMarksheet {

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

    public static class tasks{

        public int[][] store(int x){
            int[][] student = new int[x][5];

            for (int i = 0;i < x;i++){
                int sum = 0;
                for (int j = 0;j < 5;j++){
                    switch (j){
                        case 0:
                            System.out.println("Enter student "+(i+1)+" roll number: ");
                            student[i][j] = input();
                            break;
                        case 1:
                            System.out.println("Enter marks obtained in Bangla: ");
                            student[i][j] = input();
                            sum = sum + student[i][j];
                            break;
                        case 2:
                            System.out.println("Enter marks obtained in English: ");
                            student[i][j] = input();
                            sum = sum + student[i][j];
                            break;
                        case 3:
                            System.out.println("Enter marks obtained in Maths: ");
                            student[i][j] = input();
                            sum = sum + student[i][j];
                            break;
                        case 4:
                            student[i][j] = sum;
                    }
                }
                System.out.println("\n");
            }

            return student;
        }

    }

    public static void main(String[] args){
        System.out.println("Enter number of students: ");
        int n = input();
        while (n < 0){
            System.out.println("Enter a valid number: ");
            n = input();

        }
        int[][] students = new int[n][5];
        tasks t = new tasks();
        students = t.store(n);

        //here i represents student and j = 0 represent student roll, j = 1 represent marks in bangla,
        // j = 2 represents marks in English, j = 3 represents marks in Maths and j = 4 represent each student total mark.
        for (int i = 0;i < n;i++){
            for (int j = 0;j < 5;j=j+4) {
                switch (j) {
                    case 0:
                    System.out.println("Student "+(i+1)+" roll: " + students[i][j]);
                    break;
                    case 4:
                    System.out.println("Total marks: " + students[i][j]);
                    break;
                }
            }
            System.out.print("\n");
        }

        int bangla= 0;
        int roll;
        int tempb;
        for (int i = 0;i < n;i++){
            int j = 1;
            tempb = students[i][j];
            if (tempb > bangla){
                bangla = tempb;
            }
        }
        System.out.println("Highest marks in Bangla is: "+bangla);
        for (int i = 0;i < n;i++){
            int j = 1;
            if (bangla == students[i][j]){
                roll = students[i][0];
                System.out.println("Roll no. "+roll+" got highest marks in Bangla");
            }
        }

        System.out.print("\n");

        int english= 0;
        int tempe;
        for (int i = 0;i < n;i++){
            int j = 2;
            tempe = students[i][j];
            if (tempe > english){
                english = tempe;
            }
        }
        System.out.println("Highest marks in English is: "+english);
        for (int i = 0;i < n;i++){
            int j = 2;
            if (english == students[i][j]){
                roll = students[i][0];
                System.out.println("Roll no. "+roll+" got highest marks in English");
            }
        }

        System.out.print("\n");

        int maths = 0;
        int tempm;
        for (int i = 0;i < n;i++){
            int j = 3;
            tempm = students[i][j];
            if (tempm > maths){
                maths = tempm;
            }
        }
        System.out.println("Highest marks in Maths is: "+maths);
        for (int i = 0;i < n;i++){
            int j = 3;
            if (maths == students[i][j]){
                roll = students[i][0];
                System.out.println("Roll no. "+roll+" got highest marks in Maths");
            }
        }

        System.out.print("\n");

        int total = 0;
        int tempt;
        for (int i = 0;i < n;i++){
            int j = 4;
            tempt = students[i][j];
            if (tempt > total){
                total = tempt;
            }
        }
        System.out.println("Highest total mark is: "+total);
        for (int i = 0;i < n;i++){
            int j = 4;
            if (total == students[i][j]){
                roll = students[i][0];
                System.out.println("Roll no. "+roll+" got highest total marks.");
            }
        }

    }
}
