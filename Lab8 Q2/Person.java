public abstract class Person 
{
    private String name;

    public Person(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    // abstract method that will be implemented by the subclasses
    public abstract String getDescription();
}
