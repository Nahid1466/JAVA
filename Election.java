import java.util.Scanner;

public class Election {

    public static class ballots{
        private int[] votes = {0, 0, 0, 0, 0, 0};
        //private int spoilt = 0;

        ballots(int v, int[] res){

                this.setVotes(v, res);
        }

        //setter
        public int[] setVotes(int v, int[] arr){
            this.votes = arr;
            switch (v){
                case 1:
                    this.votes[0] = votes[0] + 1;
                    System.out.println("You have voted for A");
                    break;
                case 2:
                    this.votes[1] = votes[1] + 1;
                    System.out.println("You have voted for B");
                    break;
                case 3:
                    this.votes[2] = votes[2] +1;
                    System.out.println("You have voted for C");
                    break;
                case 4:
                    this.votes[3] = votes[3] + 1;
                    System.out.println("You have voted for D");
                    break;
                case 5:
                    this.votes[4] = votes[4] + 1;
                    System.out.println("You have voted for E");
                    break;
                default:
                    this.votes[5] = votes[5] + 1;
                    System.out.println("You spoilt ballot.");
                    break;

            }
            return this.votes;
        }

        public int[] getVotes(){
            return votes;
        }
    }

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

        System.out.println("Election Candidates:");
        System.out.print("1. A\n2. B\n3. C\n4. D\n5. E\n");
        System.out.println("Enter your favourite candidate number to give your vote: ");
        int n = input();
        int[] result = {0,0,0,0,0,0};
        ballots vote = new ballots(n, result);
        //vote = new ballots(n, result);
        //int[] result = test(n);
        System.out.println("Press 1 if you want to continue voting\nPress 0 if you want to exit.");
        int decision = input();
        while (!(decision == 1 || decision == 0)){
            System.out.println("Press 1 if you want to continue voting\nPress 0 if you want to exit.");
            decision = input();
        }
        while (decision == 1){
            System.out.println("Election Candidates:");
            System.out.print("1. A\n2. B\n3. C\n4. D\n5. E\n");
            System.out.println("Enter your favourite candidate number to give your vote: ");
            n = input();
            result = vote.getVotes();
            vote = new ballots(n, result);

            //result =  test1(n, result);
            System.out.println("Press 1 if you want to continue voting\nPress 0 if you want to exit.");
            decision = input();
            while (!(decision == 1 || decision == 0)){
                System.out.println("Press 1 if you want to continue voting\nPress 0 if you want to exit.");
                decision = input();
            }
        }

        result = vote.getVotes();
        System.out.println("Election Result");

        System.out.println("Candidate A got      "+result[0]+" votes");
        System.out.println("Candidate B got      "+result[1]+" votes");
        System.out.println("Candidate C got      "+result[2]+" votes");
        System.out.println("Candidate D got      "+result[3]+" votes");
        System.out.println("Candidate E got      "+result[4]+" votes");
        System.out.println("Number of spoilt ballot is: "+result[5]);

    }

}
