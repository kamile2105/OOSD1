public class Circle extends Point
{
    // additional attribute specific to Circle
    private int radius;

    // constructor to initialise x, y and the radius
    public Circle(int x, int y, int radius)
    {
        super(x, y); // super calls the constructor of the class Point
        this.radius = radius;
    }

    // setter and getter for radius
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    // string representation of the object using toString method
    public String toString()
    {
        return "( " + x + " " + y + " ) , radius = " + radius;
    }
}
