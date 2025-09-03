import java.util.*;

public class VowelConsonantCount {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static int[] countVC(String str) {
        int v=0,c=0;
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int[] res=countVC(input);
        System.out.println("Vowels: "+res[0]+", Consonants: "+res[1]);
    }
}
