public class NullPointerDemoAlternative {

    static void safeCheck() {
        String text = null;  

        if (text != null) {
            System.out.println("Length: " + text.length());
        } else {
            System.out.println("String is null, cannot find length!");
        }
    }

    public static void main(String[] args) {
        safeCheck();
    }
}
