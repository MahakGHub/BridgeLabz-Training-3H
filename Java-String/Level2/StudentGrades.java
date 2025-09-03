import java.util.*;

public class StudentGrades {
    public static int[][] generateScores(int n) {
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++) arr[i][j]=(int)(Math.random()*41)+60;
        return arr;
    }
    public static double[][] calculate(int[][] scores) {
        double[][] res=new double[scores.length][3];
        for(int i=0;i<scores.length;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double pct=(total/300.0)*100;
            res[i][0]=total;
            res[i][1]=avg;
            res[i][2]=Math.round(pct*100.0)/100.0;
        }
        return res;
    }
    public static String getGrade(double pct) {
        if(pct>=90) return "A";
        if(pct>=75) return "B";
        if(pct>=60) return "C";
        if(pct>=50) return "D";
        return "F";
    }
    public static void main(String[] args) {
        int n=5;
        int[][] scores=generateScores(n);
        double[][] calc=calculate(scores);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        for(int i=0;i<n;i++){
            String grade=getGrade(calc[i][2]);
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(int)calc[i][0]+"\t"+calc[i][1]+"\t"+calc[i][2]+"\t"+grade);
        }
    }
}
