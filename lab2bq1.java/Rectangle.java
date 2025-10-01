
public class Rectangle
{
    private int Length; // private attributes to store dimensions of the rectangle
    private int Width;


public Rectangle() // default constructor that initialises length and width to 1
{
    this.Length = 1;
    this.Width = 1;
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

public String toString() // tostring method to return a string representation of the rectangle object
{
    return  "Length = " + Length + " Width = " + Width;
}



}