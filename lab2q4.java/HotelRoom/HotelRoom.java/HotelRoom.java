
public class HotelRoom 
{
    private int RoomNumber; // private integer field
    private String RoomType; // private string field
    private double Rate; // private double field
    private boolean Occupied; // private boolean field

    public HotelRoom()
    {
        setRoomNumber(0); // default room number
        setRoomType(""); // default room type
        setRate(0.0); // default room rate
        setOccupied(false); // default room occupancy

    }

   
    public HotelRoom(int RoomNumber, String RoomType) // constructor initialises hotel room with number and type
    {
        setRoomNumber(RoomNumber); // set room number using setter
        setRoomType(RoomType);// set room type using setter
        setRate(0.0);// set room rate using setter
        setOccupied(false);// set room occupancy using setter
    }

    public HotelRoom(int RoomNumber, String RoomType, int Vacant, double Rate, boolean Occupied) // constructor initialises hotel room with full details 
    {
        setRoomNumber(RoomNumber);//set room number
        setRoomType(RoomType);//set room type
        setRate(Rate);//set room rate
        setOccupied(Occupied);//set room occupancy
    }

    public boolean isOccupied() // returns current occupancy status of the room
    {
        return Occupied;
    }

    public void setOccupied(boolean status) // sets occupancy status of the room
    {
        this.Occupied = status;
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

    public void setRoomType(String RoomType) // setter for RoomType 
    {                                      // allows external classes to set the room type
        this.RoomType = RoomType;
    }

    public String getRoomType() // Getter for RoomType
    {                           // allows external classes to retrieve room type
        return RoomType;
    }
}
