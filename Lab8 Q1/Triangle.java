// created a separate triangle class
public class Triangle extends TwoDShape 
{
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height) 
    {
        super(name, colour); // calls Shape constructor
        this.base = base;
        this.height = height;
    }

   
    public double area() 
    {
        return 0.5 * base * height; // Triangle area 
    }

  
    public String toString() 
    {
        return super.toString() + "\nBase = " + base + "\nHeight = " + height;
    }
}
