// Student Name 	: Kamile Kacinskaite
// Student Id Number: C00312390
// Date 			: 25/09/25
// Purpose 			: Lab2Q2

public class HotelRoomTest // test class for HotelRoom class
{
    public static void main(String[] args) 
    {
        HotelRoom RoomA = new HotelRoom(); // instance created of HotelRoom named RoomA
        RoomA.setRoomNumber(200); // set room number for RoomA to be 200
        RoomA.setRoomType("single"); // set room type for RoomA to be single
        RoomA.setOccupied(1); // set Occupied status of RoomA to be 1
        RoomA.setRate(100.0); // set Rate to be 100.0



        HotelRoom RoomB = new HotelRoom(); // another instance of HotelRoom named RoomB
        RoomB.setRoomNumber(201); // setting room number for RoomB to be 201
        RoomB.setRoomType("double"); // then setting the type to be double
        RoomB.setOccupied(0); // set Occupied status of RoomB to be 0
        RoomB.setRate(80); // set Rate of RoomB to be 80.0

        // output details for RoomA using getter methods from HotelRoom Class
        System.out.println("Room A : "); // 
        System.out.println("Room number: " + RoomA.getRoomNumber());
        System.out.println("Room type: " + RoomA.getRoomType()); 
        System.out.println("Room status: " + RoomA.getRate());


        // output details for RoomB using similar getter methods
        System.out.println("Room B : ");
        System.out.println("Room number: " + RoomB.getRoomNumber());
        System.out.println("Room type: " + RoomB.getRoomType());
        System.out.println("Room status: " + RoomB.getRate());

    }
    
}
