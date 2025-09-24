
public class HotelRoom 
{
    private int RoomNumber; // private integer field
    private String RoomType; // private string field

   


    public void setRoomNumber(int number) // this is the setter method for RoomNumber
    {                                       // allows external classes to set the desired room number
        RoomNumber = number;
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
