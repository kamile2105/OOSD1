// created a separate cylinder class
public class Cylinder extends ThreeDShape 
{
    private double radius;
    private double height;

    public Cylinder(String name, String colour, double radius, double height) 
    {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }


    public double area() 
    {
        return 2 * Math.PI * radius * (radius + height); // the surface area calculation
    }

  
    public double volume() 
    {
        return Math.PI * radius * radius * height; // volume calculation 
    }


    public String toString() 
    {
        return super.toString() + "\nRadius = " + radius + "\nHeight = " + height; // printing with toString
    }
}
