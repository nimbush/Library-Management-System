package Project;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;
    private String borrowedName;


    public Book(String title, String author, String ISBN, boolean isAvailable, String borrowedName ){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
        this.borrowedName = borrowedName;
    }

    public void setBorrowedName(String borrowedName) {
        this.borrowedName = borrowedName;
    }

    public String getBorrowedName() {
        return borrowedName;
    }

    public Book(String title, boolean isAvailable){
        this.title= title;
        this.isAvailable= isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
