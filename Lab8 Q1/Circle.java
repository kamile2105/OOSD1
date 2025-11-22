// created a separate circle class
public class Circle extends TwoDShape 
{
    private double radius;

    public Circle(String name, String colour, double radius) 
    {
        super(name, colour);
        this.radius = radius;
    }

   
    public double area() 
    {
        return Math.PI * radius * radius; // calculation to get the area 
    }

    public String toString()
    {
        return super.toString() + "\nRadius = " + radius; // toString for output 
    }
}
