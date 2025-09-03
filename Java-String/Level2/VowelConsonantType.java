import java.util.*;

public class VowelConsonantType {
    public static String getType(char c) {
        c = Character.toLowerCase(c);
        if (!Character.isLetter(c)) return "Not a Letter";
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }
    public static String[][] checkString(String str) {
        String[][] arr=new String[str.length()][2];
        for(int i=0;i<str.length();i++){
            arr[i][0]=String.valueOf(str.charAt(i));
            arr[i][1]=getType(str.charAt(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[][] res=checkString(input);
        for(String[] r:res) System.out.println(r[0]+" -> "+r[1]);
    }
}
