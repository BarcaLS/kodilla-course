package food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Seller {
    String sellerName = "GlutenFreeShop";
    String product = "Jabłka";
    List<String> branches = new ArrayList<>();
    List<String> contactPersons = new ArrayList<>();
    int productQuantity = 3;

    public GlutenFreeShop() {
        branches.add("Zamość");
        branches.add("Lublin");
        contactPersons.add("Nowak");
        contactPersons.add("Kowalski");
    }

    @Override
    public OrderDTO process(ProductDTO productDTO) {
        boolean branchExists = false;
        boolean contactPersonExists = false;
        boolean available = false;

        for(String currentBranch : branches) {
            if(currentBranch.equals(productDTO.getBranch()))
                branchExists = true;
        }
        for(String currentPerson : contactPersons) {
            if(currentPerson.equals(productDTO.getContactPerson()))
                contactPersonExists = true;
        }
        available = checkIfAvailable(productDTO, branchExists, contactPersonExists);
        return new OrderDTO(productDTO.getProduct(), productQuantity, available);
    }

    private boolean checkIfAvailable(ProductDTO productDTO, boolean branchExists, boolean contactPersonExists) {
        return product.equals(productDTO.getProduct()) && productQuantity >= productDTO.getQuantity() && branchExists && contactPersonExists;
    }

}
