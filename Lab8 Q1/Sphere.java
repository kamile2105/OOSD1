// created a separate sphere class
public class Sphere extends ThreeDShape 
{
    private double radius;

    public Sphere(String name, String colour, double radius) 
    {
        super(name, colour);
        this.radius = radius;
    }


    public double area() 
    {
        return 4 * Math.PI * radius * radius; // area for Sphere
    }

   
    public double volume() 
    {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius; // volume calculation
    }

    public String toString() 
    {
        return super.toString() + "\nRadius = " + radius; // printing with toString
    }
}
