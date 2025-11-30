// CD class that extends LibraryItem and implements the loanitem interface 
public class CD extends LibraryItem implements LoanItem 
// implements means that a class promises to provide the methods defined in an interface 
{
    // variables
    private String band;
    private String title;
    private int numTracks;

    // constructor 
    public CD(String ID, String band, String title, int numTracks) 
    {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    // set and get methods
    public double calculatePrice() 
    {
        // for example the price is  1 euro per track
        return numTracks * 1.0;
    }

     // toString to output result as a String
    public String toString() 
    {
        return "CD: " + title + " by " + band + " (" + numTracks + " tracks)";
    }
}
