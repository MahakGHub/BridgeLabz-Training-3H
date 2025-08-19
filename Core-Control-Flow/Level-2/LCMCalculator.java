public class LCMCalculator {
    public static void main(String[] args) {
        int a = 12, b = 18, lcm;
        int max = (a > b) ? a : b;

        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
