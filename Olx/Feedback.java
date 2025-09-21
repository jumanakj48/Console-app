package Olx;
import java.util.Objects;

public class Feedback {

    private String userName;
    private String productName;
    private String feedback;
    private int rating;
    

   

    public Feedback(String userName, String productName, String feedback, int rating) {
        this.userName = userName;
        this.productName = productName;
        this.feedback = feedback;
        this.rating = rating;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Feedback userName(String userName) {
        setUserName(userName);
        return this;
    }

    public Feedback productName(String productName) {
        setProductName(productName);
        return this;
    }

    public Feedback feedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    public Feedback rating(int rating) {
        setRating(rating);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) o;
        return Objects.equals(userName, feedback.userName) && Objects.equals(productName, feedback.productName) && Objects.equals(feedback, feedback.feedback) && rating == feedback.rating;
    }

  

    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", productName='" + getProductName() + "'" +
            ", feedback='" + getFeedback() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

    
}
