import java.util.*;

public class RockPaperScissors {
    public static String getChoice(int n) {
        if(n==0) return "Rock";
        if(n==1) return "Paper";
        return "Scissors";
    }
    public static int winner(String user,String comp) {
        if(user.equals(comp)) return 0;
        if(user.equals("Rock")&&comp.equals("Scissors")) return 1;
        if(user.equals("Paper")&&comp.equals("Rock")) return 1;
        if(user.equals("Scissors")&&comp.equals("Paper")) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<games;i++){
            String user=sc.next();
            String comp=getChoice((int)(Math.random()*3));
            int res=winner(user,comp);
            if(res==1) userWins++;
            else if(res==-1) compWins++;
            System.out.println("User: "+user+" Comp: "+comp+" Result: "+res);
        }
        System.out.println("User Wins: "+userWins+" Comp Wins: "+compWins);
        double userPct=(userWins*100.0)/games;
        double compPct=(compWins*100.0)/games;
        System.out.println("User %: "+userPct+" Comp %: "+compPct);
    }
}
