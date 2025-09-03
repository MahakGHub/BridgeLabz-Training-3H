import java.util.*;

public class StringTrimCustom {
    public static String trim(String str) {
        int start=0,end=str.length()-1;
        while(start<=end && str.charAt(start)==' ') start++;
        while(end>=start && str.charAt(end)==' ') end--;
        return str.substring(start,end+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String custom=trim(input);
        String builtin=input.trim();
        System.out.println("Custom: '"+custom+"'");
        System.out.println("Built-in: '"+builtin+"'");
    }
}
