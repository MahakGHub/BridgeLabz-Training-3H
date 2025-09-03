public class ItemMain {
    public static void main(String[] args) {
        Item item1 = new Item(201, "Notebook", 50.5);
        item1.displayItem();
        System.out.println("Total Cost (5 pcs): " + item1.calculateTotalCost(5));
    }
}