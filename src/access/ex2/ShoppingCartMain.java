package access.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 1000, 12);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
    }
}
