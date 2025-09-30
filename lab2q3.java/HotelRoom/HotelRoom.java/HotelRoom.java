
public class HotelRoom 
{
    private int RoomNumber; // private integer field
    private String RoomType; // private string field
    private int Vacant; // private integer field
    private double Rate; // private double field

    public HotelRoom()
    {
        setRoomNumber(0); // default room number
        setRoomType(""); // default room type
        setVacant(0); // default room status (0 = vacant)
        setRate(0.0); // default room rate
    }

   
    public HotelRoom(int RoomNumber, String RoomType) // constructor with partial parameters (room number and type)
    {                                                   // allows the creation of HotelRoom object wit basic info
        setRoomNumber(RoomNumber); // setter room number
        setRoomType(RoomType); // setter room type
    }

    public HotelRoom(int RoomNumber, String RoomType, int Vacant, double Rate) // construcor with full parameters
    {                                                                          // allows creation of HotelRoom object
        setRoomNumber(RoomNumber); // setter room number
        setRoomType(RoomType); // setter room type
        setVacant(Vacant); // setter for vacancy
        setRate(Rate); // setter for rate
    }


    public void setRoomNumber(int RoomNumber) // this is the setter method for RoomNumber
    {                                       // allows external classes to set the desired room number
        this.RoomNumber = RoomNumber;
    }

    public int getRoomNumber() // getter method for RoomNumber
    {                           // allows external classes to retrieve the room number
        return RoomNumber;
    }

    public void setRate(double nightRate) // setter method for Rate
    {
        this.Rate = nightRate;
    }

    public double getRate() // getter for Rate
    {
        return Rate;
    }

    public void setVacant(int status) // setter method for Occupied
    {
        if(status ==0 || status == 1) // if statement checking the status
        {
            Vacant = status;
        }
        else // else telling its invalid
        {
            System.out.println("Invalid status");
        }
    }

    public int getVacant() // getter for Occupied
    {
        return Vacant;
    }

    public void setRoomType(String RoomType) // setter for RoomType 
    {                                      // allows external classes to set the room type
        this.RoomType = RoomType;
    }

    public String getRoomType() // Getter for RoomType
    {                           // allows external classes to retrieve room type
        return RoomType;
    }
}
