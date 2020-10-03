package challenges;

public class ProductOrderService {


    private InformationService informationService;
    private BuyingService buyingService;
    private OrderRepository orderRepository;

    public ProductOrderService (final InformationService informationService,
                                final BuyingService buyingService,
                                final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.buyingService = buyingService;
        this.orderRepository = orderRepository;
    }

    public BuyingDto process(final BuyRequest BuyRequest) {
        boolean isBought = buyingService.buy(BuyRequest.getUser(), BuyRequest.getItem(),
                BuyRequest.getPrice());

        if (isBought) {
            informationService.inform(BuyRequest.getUser());
            orderRepository.createPurchase(BuyRequest.getUser(), BuyRequest.getItem(), BuyRequest.getPrice());
            return new BuyingDto(BuyRequest.getUser(), true);
        } else {
            return new BuyingDto(BuyRequest.getUser(), false);
        }
    }
}
