public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Mahak", 20);
        Person p2 = new Person(p1); // copy

        p1.display();
        p2.display();
    }
}
