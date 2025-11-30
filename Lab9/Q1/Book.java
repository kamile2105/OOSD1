// Book class that extends LibraryItem and implements the loanitem interface 
public class Book extends LibraryItem implements LoanItem 
// implements means that a class promises to provide the methods defined in an interface 
{
    // variables
    private String author;
    private String title;
    private int numPages;

    // constructor
    public Book(String ID, String author, String title, int numPages) 
    {
        super("Book", ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    // set and get methods 
    public double calculatePrice() 
    {
        // for example the price is  0.05 euro per page
        return numPages * 0.05;
    }

    // toString to output result as a String
    public String toString() 
    {
        return "Book: " + title + " by " + author + " (" + numPages + " pages)";
    }
}
