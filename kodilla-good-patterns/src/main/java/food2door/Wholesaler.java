package food2door;

public class Wholesaler {
    public Wholesaler() { }

    public OrderDTO order(ProductDTO productDTO) {
        Seller shop;

        if (productDTO.getShop().equals("ExtraFoodShop")) {
            shop = new ExtraFoodShop();
        } else if (productDTO.getShop().equals("HealthyShop")) {
            shop = new HealthyShop();
        } else {
            shop = new GlutenFreeShop();
        }
        return shop.process(productDTO);
    }
}
