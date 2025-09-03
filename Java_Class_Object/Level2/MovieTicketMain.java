public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("", 0, 0.0);
        t1.bookTicket("Inception", 25, 300);
        t1.displayDetails();
    }
}