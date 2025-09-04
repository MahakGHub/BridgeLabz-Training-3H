public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Mahak", 8.7);
        pg.showDetails();
        pg.setCgpa(9.0);
        pg.showDetails();
    }
}
