public class TestPerson {
    public static void main(String[] args) 
    {
        // creating a polymorphic array of Person
        Person[] people = new Person[2];

        // add one Employee and one Student
        people[0] = new Employee("Alice", 55000);
        people[1] = new Student("Kamile", "Software Development");

        // then print the name and description for each element
        for (Person p : people) {
            System.out.println("Name: " + p.getName());
            System.out.println("Description: " + p.getDescription());
            System.out.println();
        }
    }
}
