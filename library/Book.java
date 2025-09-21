package library;

public class Book {
    String bookName;
    String author;
    boolean isAvailable;

    Book(String bookName, String author){
        this.bookName= bookName;
        this.author=author;
        this.isAvailable=true;
        
    }

    public String getName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean set){
        isAvailable= set;
    }

    
}
