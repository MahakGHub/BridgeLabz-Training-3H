public class CollinearPointsChecker {
    public static boolean checkSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        double slopeAB=(double)(y2-y1)/(x2-x1);
        double slopeBC=(double)(y3-y2)/(x3-x2);
        double slopeAC=(double)(y3-y1)/(x3-x1);
        return slopeAB==slopeBC && slopeBC==slopeAC;
    }

    public static boolean checkArea(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }

    public static void main(String[] args){
        System.out.println("Slope method: "+checkSlope(2,4,4,6,6,8));
        System.out.println("Area method: "+checkArea(2,4,4,6,6,8));
    }
}
