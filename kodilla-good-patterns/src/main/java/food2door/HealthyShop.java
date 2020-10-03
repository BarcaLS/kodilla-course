package food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Seller {
    String sellerName = "HealthyShop";
    String product = "Pomarańcze";
    List<String> branches = new ArrayList<>();
    int productQuantity = 50;

    public HealthyShop() {
        branches.add("Gdańsk");
        branches.add("Poznań");
        branches.add("Katowice");
    }

    @Override
    public OrderDTO process(ProductDTO productDTO) {
        boolean branchExists = false;
        boolean available = false;

        for(String currentBranch : branches) {
            if(currentBranch.equals(productDTO.getBranch()))
                branchExists = true;
        }
        available = checkIfAvailable(productDTO, branchExists);
        return new OrderDTO(productDTO.getProduct(), productQuantity, available);
    }

    private boolean checkIfAvailable(ProductDTO productDTO, boolean branchExists) {
        return product.equals(productDTO.getProduct()) && productQuantity >= productDTO.getQuantity() && branchExists;
    }
}
