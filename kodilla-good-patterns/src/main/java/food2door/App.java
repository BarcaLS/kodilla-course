package food2door;

public class App {
    public static void main(String[] args) {
        Wholesaler wholesaler = new Wholesaler();
        OrderDTO orderDTO;

        orderDTO = wholesaler.order(new ProductDTO("ExtraFoodShop", "Jarzębina", 5));
        checkOrder(orderDTO);
        orderDTO = wholesaler.order(new ProductDTO("HealthyShop", "Gruszki", 3, "Katowice"));
        checkOrder(orderDTO);
        orderDTO = wholesaler.order(new ProductDTO("GlutenFreeShop", "Jabłka", 5, "Warszawa", "Kowalski"));
        checkOrder(orderDTO);
    }

    static void checkOrder(OrderDTO orderDTO) {
        if(orderDTO.isAvailable()) {
            System.out.println("Zamówienie może być zrealizowane u tego dostawcy. Wysłać zamówienie?");
        } else {
            System.out.println("Zamówienie nie może być zrealizowane u tego dostawcy.");
        }
    }
}
