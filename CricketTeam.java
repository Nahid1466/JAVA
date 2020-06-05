import java.util.Scanner;

public class CricketTeam {

    static float inputfloat(){
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

    static int inputint(){
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

    static String inputString(){
        String value_n;
        while (true){
            try{
                Scanner n = new Scanner(System.in);
                value_n = n.nextLine();
            }catch (Exception e){
                System.out.println("Sorry I didn't Understand that");
                continue;
            }
            break;
        }
        return value_n;
    }

    public static class Cricket{
        String PlayerName, TeamName;
        float BattingAvg;

        Cricket(String pn, String tn, float ba){
            setGame(pn, tn, ba);
        }

        public void setGame(String p, String t, float b){
            this.PlayerName = p;
            this.TeamName = t;
            this.BattingAvg = b;
        }

        public String getPlayerName(){
            return PlayerName;
        }
        public String getTeamName(){
            return TeamName;
        }
        public float getBattingAvg(){
            return BattingAvg;
        }
    }

    public static void main(String[] args){

        System.out.println("Enter number of players: ");
        int num = inputint();

        Cricket[] player = new Cricket[num];

        for (int i = 0;i < num;i++){
            System.out.println("Player "+(i+1)+":");
            System.out.print("Enter player name: ");
            String name = inputString();
            System.out.print("Enter Team Name: ");
            String tname = inputString();
            System.out.print("Enter batting average: ");
            float batavg = inputfloat();
            player[i] = new Cricket(name, tname, batavg);
        }

        System.out.println("Team Name\t\tPlayer Name\t\tBatting Average");
        for (int i = 0; i < num;i++){
            String name = player[i].getPlayerName();
            String tname = player[i].getTeamName();
            float batavg = player[i].getBattingAvg();
            System.out.println(tname+"\t\t\t\t "+name+"\t\t\t\t"+batavg);
        }

    }
}
