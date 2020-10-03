package food2door;

public class OrderDTO {
    String product;
    int quantity;
    boolean available;

    public OrderDTO() {
    }

    public OrderDTO(String product, int quantity, boolean available) {
        this.product = product;
        this.quantity = quantity;
        this.available = available;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAvailable() {
        return available;
    }
}
