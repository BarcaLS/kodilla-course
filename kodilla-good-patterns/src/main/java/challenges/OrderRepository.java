package challenges;

public class OrderRepository {
    void createPurchase(String user, String item, double price) {
        System.out.println("Odnotowano zakup przez użytkownika " + user + " przedmiotu " + item + " za cenę " + price);
    }
}
