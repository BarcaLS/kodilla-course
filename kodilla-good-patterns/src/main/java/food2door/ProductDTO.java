package food2door;

public class ProductDTO {
    String shop;
    String product;
    int quantity;
    String branch;
    String contactPerson;

    public ProductDTO(String shop, String product, int quantity) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public ProductDTO(String shop, String product, int quantity, String branch) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
        this.branch = branch;
    }

    public ProductDTO(String shop, String product, int quantity, String branch, String contactPerson) {
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
        this.branch = branch;
        this.contactPerson = contactPerson;
    }

    public String getShop() {
        return shop;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBranch() {
        return branch;
    }

    public String getContactPerson() {
        return contactPerson;
    }
}
