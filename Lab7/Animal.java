public class Animal 
{
    // variables
    protected String name;
    protected int age;

    // constructor
    public Animal(String name, int age)
    {
        this.age = age;
        this.name = name;
    }
    
    // toString method to print result as a string
    public String getDetails()
    {
        return "Name: " + name + " Age: " + age;
    }
}
