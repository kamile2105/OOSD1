public class Dog extends Animal
{
    // variables 
    private String breed;

    // constructor
    public Dog(String name, int age, String breed)
    {
        super(name, age);
        this.breed = breed;
    }

    // toString method to print result as a string
    public String getDetails()
    {
        return super.getDetails() + " , Breed: " + breed;
    }


}
