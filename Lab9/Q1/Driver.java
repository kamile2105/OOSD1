// Kamile Kacinskaite
// C00312390 
// 30/11/25
// Lab 9 Q1. Tests your understanding of the concept of interfaces and inheritance in Java


public class Driver 
{
    public static void main(String[] args) 
    {

        LibraryItem[] items = new LibraryItem[2];

        // creating the Book and CD objects
        items[0] = new Book("B001", "George Orwell", "1984", 328);
        items[1] = new CD("C001", "Pink Floyd", "The Wall", 26);

        // looping through the array and doing calculatePrice if needed
        for (LibraryItem item : items) 
            {
                System.out.println(item.toString());

                if (item instanceof LoanItem) 
                    {
                        double price = ((LoanItem) item).calculatePrice();
                        System.out.println("Loan Price: " + price + " euro ");
                    }

            System.out.println();
        }
    }
}
