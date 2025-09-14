class Product {
    private static double discount = 10.0; // in %

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Mouse", 500, 2, 102);

        p1.displayProduct();
        p2.displayProduct();

        Product.updateDiscount(15.0);
        p1.displayProduct();
    }
}
