package food2door;

public class ExtraFoodShop implements Seller {
    String sellerName = "ExtraFoodShop";
    String product = "Jarzębina";
    int productQuantity = 50;

    public ExtraFoodShop() {};

    @Override
    public OrderDTO process(ProductDTO productDTO) {
        boolean available = false;

        available = checkIfAvailable(productDTO);
        return new OrderDTO(productDTO.getProduct(), productQuantity, available);
    }

    private boolean checkIfAvailable(ProductDTO productDTO) {
        return product.equals(productDTO.getProduct()) && productQuantity >= productDTO.getQuantity();
    }
}
