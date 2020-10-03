package challenges;

public class BuyingService {
    boolean buy(String user, String item, double price) {
        boolean result;

        System.out.println("Użytkownik " + user + " kupił " + item + " za cenę " + price);
        result = true;

        return result;
    }
}
