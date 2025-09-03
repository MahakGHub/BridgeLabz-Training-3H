public class EuclideanDistanceLineEquation {
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void lineEquation(int x1, int y1, int x2, int y2) {
        int a = y2 - y1;
        int b = x1 - x2;
        int c = (y1 * (x2 - x1)) - (x1 * (y2 - y1));
        System.out.println("Line equation: " + a + "x + " + b + "y + " + c + " = 0");
    }

    public static void main(String[] args) {
        int x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        System.out.println("Euclidean Distance: " + euclideanDistance(x1, y1, x2, y2));
        lineEquation(x1, y1, x2, y2);
    }
}

