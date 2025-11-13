public class Vet 
{
    // variables
    private String name;

    // constructor
    public Vet(String name)
    {
        this.name = name;
    }

    // method to print vets name & who he/she is vaccinating and the vaccination status of dog or cat
    public void vaccinate(Animal animal)
    {
        System.out.println(name + " is vaccinating ");
        if(animal instanceof Dog)
        {
            System.out.println("Dog has been vaccinated " + animal.getDetails());
        }
        else if(animal instanceof Cat)
        {
            System.out.println("Cat has been vaccinated " + animal.getDetails());
        }
        else
        {
            System.out.println("Unknown animal type. Try again!");
        }
    }
}
