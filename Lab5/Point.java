public class Point 
{
    // protected variables that can be accessed by a subclass (Circle)
    protected int x;
    protected int y;

    // constructor to initialise the x and y variables
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // setter and getter methods for x and y variables
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    // toString method to return a string representation of the object
    public String toString()
    {
        return "( " + x + " " + y + " )";
    }
}
