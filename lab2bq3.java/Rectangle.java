
public class Rectangle
{
    private int Length; // private attributes to store dimensions of the rectangle
    private int Width;


public Rectangle() // default constructor that initialises length and width to 1
{
    this.Length = 1;
    this.Width = 1;
}

public void printRectangle()
{ 
    int i;
    int rows = Length; // represents number of lines
    int cols = Width;// represents number of characters on each line

    for(i =0; i < rows; i ++) // loop through each row of rectangle
    {
        // if its first or last row print row of stars 
        if(i == 0 || i == rows - 1)
        {
            for(int j = 0; j < cols; j ++)
            {
                System.out.println("*"); // print a star
            }
        }
        else 
        // else for middle rows print star at beginning and end with space in between
    {
        System.err.println("*"); // left edge
        // print spaces between edges
        for(int j = 0; j < cols - 2; j ++)
        {
            System.out.println(" ");
        }
        //only print right edge star if width > 1
        if(cols > 1)
        {
            System.out.println("*");
        }
    }
    System.err.println(); // move to next line after each row
    }
    
}

public void setLength( int Length ) // setter method for length with a validation
{
    if(Length > 0.0 && Length <= 40.0){
         this.Length = Length;
    }
    else {
        System.out.println("Invalid Length. Must be bigger than 0 & less than 40.");
    }

}

public void setWidth( int Width) // setter here aswell but for width with a validation also
{
    if(Width > 0.0 && Width <= 40.0)
    {
        this.Width = Width;
    }
    else{
        System.out.println("Invalid Width. Must be bigger than 0 & less than 40.");
    }
}

public int getLength() // getter for length
{
    return Length;
}

public int getWidth() // getter for width
{
    return Width;
}

public int getArea() // area method 
{
    return Length * Width; // calculation
}

public int getPerimeter() // perimeter method 
{
    return 2 * (Length + Width); // calculation
}

public String toString() // tostring method to return a string representation of the rectangle object
{
    return  "Length = " + Length + " Width = " + Width;
}



}