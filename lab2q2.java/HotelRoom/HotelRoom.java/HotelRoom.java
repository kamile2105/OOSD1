
public class HotelRoom 
{
    private int RoomNumber; // private integer field
    private String RoomType; // private string field
    private int Occupied; // private integer field
    private double Rate; // private double field

   
    public void setOccupied(int status) // setter method for Occupied
    {
        if(status ==0 || status == 1) // if statement checking the status
        {
            Occupied = status;
        }
        else // else telling its invalid
        {
            System.out.println("Invalid status");
        }
    }

    public void setRate(double nightRate) // setter method for Rate
    {
        Rate = nightRate;
    }

    public void setRoomNumber(int number) // this is the setter method for RoomNumber
    {                                       // allows external classes to set the desired room number
        RoomNumber = number;
    }

    public double getRate() // getter for Rate
    {
        return Rate;
    }

    public int getOccupied() // getter for Occupied
    {
        return Occupied;
    }

    public int getRoomNumber() // getter method for RoomNumber
    {                           // allows external classes to retrieve the room number
        return RoomNumber;
    }

    public void setRoomType(String type) // setter for RoomType 
    {                                      // allows external classes to set the room type
        RoomType = type;
    }

    public String getRoomType() // Getter for RoomType
    {                           // allows external classes to retrieve room type
        return RoomType;
    }
}
