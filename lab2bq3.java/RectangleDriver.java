
// Student Name     : Kamile Kacinskaite
// Student Id Number: C00312390
// Date             : 05/10/25
// Purpose          : Lab2bq3

public class RectangleDriver // driver program to test the rectangle class
{
    public static void main(String[] args) 
    {
       Rectangle Rect = new Rectangle(); // new rectangle object using default constructor

        System.out.println("The Default Values: "); // display default values of length and width
        System.out.println(Rect.toString());

        Rect.setLength(7);//set valid values
        Rect.setWidth(5);

        System.out.println("Updated values: " + Rect.toString()); // display updated values
        
        // test with setting invalid values for length and width
        Rect.setLength(-3); // invalid has to be less than zero
        Rect.setWidth(43); // invalid also has to be greater than 40

        System.out.println("After invalid attempts: " + Rect.toString()); // show values after attempting invalid values
        // display individual values using getters
        System.out.println("Length is: " + Rect.getLength());
        System.out.println("Width is: " + Rect.getWidth());

        System.err.println(Rect.toString());
        System.out.println("Area: " + Rect.getArea()); // test and display the area
        System.out.println("Perimeter: " + Rect.getPerimeter()); // test and display the perimeter 

        System.out.println("Rectangle: ");
        Rect.printRectangle(); // calling the printRectangle method to print the stars to make up a rectangle
    }
}
