package challenges;

public class ProductOrderServiceApp {
    public static void main(String[] args) {
        BuyingRequestRetriever buyingRequestRetriever = new BuyingRequestRetriever();
        BuyRequest buyRequest = buyingRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new BuyingService(), new OrderRepository());
        productOrderService.process(buyRequest);
    }
}
