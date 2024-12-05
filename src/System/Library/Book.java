package System.Library;
package TESTING;
import java.util.Vector;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;
    private double price;
    public int count;
    static private int All_Book_Counter = 0;
    public Book(int bookId, String title, String author, int publicationYear, double price , int count) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
        this.count = count;
        this.isAvailable = (count > 0);
        All_Book_Counter += count;
    }

    // Getters and setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int id) {
        this.bookId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAvailable(Book book) {
        return book.count > 0;
    }

    public void SetAvalible(){
        this.isAvailable = (count > 0);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display_book_deatils(Book book){
        System.out.println("Book ID: " + book.getBookId() + "\nBook Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor() + "\nBook Publish PublicationYear: " + book.getPublicationYear());
        System.out.println("Book Price: " + book.getPrice() + "\nBook Availablity: " + book.isAvailable(book));
        System.out.println("Book Count: " + book.count);
    }

    public boolean Check_Discount(Book book){
        return book.count <= 3;
    }

    // Show All Books From File>>>>

}
