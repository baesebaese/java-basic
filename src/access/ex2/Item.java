package access.ex2;

public class Item {
    private String name;
    private int price;
    private int quatity;

    public Item(String name, int price, int quatity) {
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price*quatity;
    }
}
