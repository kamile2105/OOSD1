// Kamile Kacinskaite
// C00312390
// 13/11/25
// Lab 7 Tests your understanding of the concept of inheritance and polymorphism.
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); // importing a scanner
       
        System.out.println("Enter Vet's name: "); 
        String vetName = scanner.nextLine();
        Vet vet = new Vet(vetName); // creating new vet 

        boolean moreAnimals = true;
        while(moreAnimals) // while loop to loop through each option until user decides to stop
        {
            System.out.println("Vaccinating a Dog or a Cat? Enter (D/C): ");
            String choice = scanner.nextLine();

            if(choice.equals("D")) // if D is picked they enter dog details 
            {
                System.out.println("Enter Dog's name: ");
                String dogName = scanner.nextLine();
                System.out.println("Enter Dog's age: ");
                int dogAge = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Dog's breed: "); 
                String dogBreed = scanner.nextLine();
               
                Dog dog = new Dog(dogName, dogAge, dogBreed);

                vet.vaccinate(dog); // printing the vet and their pet's vaccination information
            }
            else if(choice.equals("C"))  // if C is picked they enter cat details 
            {
                System.out.println("Enter Cat's name: ");
                String catName = scanner.nextLine();
                System.out.println("Enter Cat's age: ");
                int catAge = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter Cat's colour: "); 
                String catColour = scanner.nextLine();
                System.out.println();
                
                Cat cat = new Cat(catName, catAge, catColour);

                vet.vaccinate(cat); // printing the vet and their pet's vaccination information
            }
            else
            {
                System.out.println("Invalid choice please pick D or C: "); // otherwise for an unknown input print error message
                continue;
            }

            System.out.println("Do you want to vaccinate another animal? (yes/no)"); // asking if another pet needs vaccinations
            String another = scanner.nextLine();
            if(!another.equals("yes")) // if statement for the answer and asking again if they pick yes 
            {
                moreAnimals = false;
            }
        }

        scanner.close(); // closing scanner
        System.out.println("All animals have been vaccinated. Thank you!"); // print this if they say no to vaccinate another animal

    }
}
