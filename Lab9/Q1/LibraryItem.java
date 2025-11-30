// libraryItem class 
public class LibraryItem 
{
    // variables
    protected String type;
    protected String ID;

    //constructor
    public LibraryItem(String type, String ID) 
    {
        this.type = type;
        this.ID = ID;
    }

    //setter and getter
    public String getType()
    {
        return type;
    }

    public String getID() 
    {
        return ID;
    }
}
