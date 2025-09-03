public class CartItemMain {
    public static void main(String[] args) {
        CartItem cart1 = new CartItem("Laptop", 50000, 1);
        cart1.addItem(2);
        cart1.removeItem(1);
        cart1.displayCart();
    }
}