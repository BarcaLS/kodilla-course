package challenges;

public class BuyingRequestRetriever {
    public BuyRequest retrieve() {
        String user = "Marcin";
        String item = "Mossberg Shockwave";
        double price = 1399.00;

        return new BuyRequest(user, item, price);
    }
}
