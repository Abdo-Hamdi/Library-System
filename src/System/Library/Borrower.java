package System.Library;
import  java.util.ArrayList;
import  java.util.Vector;

public class Borrower extends person {
    protected Vector<borrowed_book>history=new Vector<>();
    Vector<Borrower> borrower_user = new Vector<>();
    String phone;
    public Borrower(String name, int id,String phone) {
        super(name, id);
        this.phone = phone;
    }
    public String getname() {
        return this.getname();
    }
    public int getid() {
        return this.getid();
    }
    public int getphone() {
        return this.phone();
    }
    public void borrowBook(Book book,Borrower b) {
        if (book.is_Avalible()) {
            history.add(new borrowed_book(book ,b));
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is currently unavailable.");
            /* wating bishoy method */
        }
    }

    /*public void return_book(Book book) {
        if (borrowed_book.contains(book)) {
            borrowed_book.remove(book);
            book.status(true);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("This book was not borrowed by you.");
        }
    }*/
    
    public void displayinfo(int ID) {
        for (int i = 0; i < borrower_user.size(); i++) {
            if (borrower_user.elementAt(i).id.equalsto(ID)) {
                System.out.println("borrower name : " + borrower_user.elementAt(i).getname());
                System.out.println("borrower ID : " + borrower_user.elementAt(i).getid());
                System.out.println("borrower phone number : " + borrower_user.elementAt(i).getphone());
                break;
            }
        }

    }
}

public class borrowed_book {
    String borrower_name, book_title, book_author, year;
    int book_id, borrower_id;
    double book_price;

    public borrowed_book(Book book, Borrower b) {
        this.book_id = book.getid();
        this.book_title = book.gettitle();
        this.book_author = book.getauthor();
        this.year = book.getyear();
        this.price = book.getprice();
        this.borrower_id = b.getid();
        this.borrower_name = b.getname();

    }
}