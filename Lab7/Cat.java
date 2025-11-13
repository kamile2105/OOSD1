public class Cat extends Animal
{
    // variables
    private String colour;

    // constructor
    public Cat(String name, int age, String colour)
    {
        super(name, age);
        this.colour = colour;
    }

     // toString method to print result as a string
    public String getDetails()
    {
        return super.getDetails() + " , Colour: " + colour;
    }
}
