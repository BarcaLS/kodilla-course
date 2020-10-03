package challenges;

public class BuyRequest {
    String user;
    String item;
    double price;

    public BuyRequest(String user, String item, double price) {
        this.user = user;
        this.item = item;
        this.price = price;
    }

    public String getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}
