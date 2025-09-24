// Student Name 	: Kamile Kacinskaite
// Student Id Number: C00312390
// Date 			: 24/09/25
// Purpose 			: Lab2Q1

public class HotelRoomTest // test class for HotelRoom class
{
    public static void main(String[] args) 
    {
        HotelRoom RoomA = new HotelRoom(); // instance created of HotelRoom named RoomA
        RoomA.setRoomNumber(200); // set room number for RoomA to be 200
        RoomA.setRoomType("single"); // set room type for RoomA to be single

        HotelRoom RoomB = new HotelRoom(); // another instance of HotelRoom named RoomB
        RoomB.setRoomNumber(201); // setting room number for RoomB to be 201
        RoomB.setRoomType("double"); // then setting the type to be double

        // output details for RoomA using getter methods from HotelRoom Class
        System.out.println("Room A : "); // 
        System.out.println("Room number: " + RoomA.getRoomNumber());
        System.out.println("Room type: " + RoomA.getRoomType()); 

        // output details for RoomB using similar getter methods
        System.out.println("Room B : ");
        System.out.println("Room number: " + RoomB.getRoomNumber());
        System.out.println("Room type: " + RoomB.getRoomType());
    }
    
}
