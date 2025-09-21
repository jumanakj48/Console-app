package Olx;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class product {
    private UUID id;
    private String productName;
    private String price;
    private String productDescription;
    private int quantity;
    private List<Feedback> feedbacks;

    public product(String productName, String price, String productDescription, int quantity) {
        this.id = UUID.randomUUID();
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.feedbacks = new ArrayList<>();

    }

    public UUID getProductId() {
        return this.id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFeedback(Feedback feedback) {

    }

}
