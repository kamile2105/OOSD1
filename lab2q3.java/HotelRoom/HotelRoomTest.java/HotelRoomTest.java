// Student Name 	: Kamile Kacinskaite
// Student Id Number: C00312390
// Date 			: 30/09/25
// Purpose 			: Lab2Q3

public class HotelRoomTest // test class for HotelRoom class
{
    public static void main(String[] args) 
    {
        HotelRoom RoomA = new HotelRoom(); // instance created of HotelRoom named RoomA
        RoomA.setRoomNumber(200); // set room number for RoomA to be 200
        RoomA.setRoomType("single"); // set room type for RoomA to be single
        RoomA.setVacant(1); // set Occupied status of RoomA to be 1
        RoomA.setRate(100.0); // set Rate to be 100.0

        HotelRoom RoomB = new HotelRoom(); // another instance of HotelRoom named RoomB
        RoomB.setRoomNumber(201); // setting room number for RoomB to be 201
        RoomB.setRoomType("double"); // then setting the type to be double
        RoomB.setVacant(0); // set Occupied status of RoomB to be 0
        RoomB.setRate(80); // set Rate of RoomB to be 80.0

        HotelRoom RoomC = new HotelRoom(); // another instance of HotelRoom named RoomC
        RoomC.setRoomNumber(202); // setting room number for RoomC to be 202
        RoomC.setRoomType("single"); // then setting the type to be single
        RoomC.setVacant(0); // set Occupied status of RoomB to be 0
        RoomC.setRate(90); // set Rate of RoomB to be 90.0


        // output details for RoomA using getter methods from HotelRoom Class
        System.out.println("Room A : "); // 
        System.out.println("Room number: " + RoomA.getRoomNumber());
        System.out.println("Room type: " + RoomA.getRoomType());
        System.out.println("Vacancy: " + RoomA.getVacant());
        System.out.println("Room status: " + RoomA.getRate());


        // output details for RoomB using similar getter methods
        System.out.println("Room B : ");
        System.out.println("Room number: " + RoomB.getRoomNumber());
        System.out.println("Room type: " + RoomB.getRoomType());
        System.out.println("Vacancy: " + RoomB.getVacant());
        System.out.println("Room status: " + RoomB.getRate());

        // output details for RoomC using similar getter methods
        System.out.println("Room C : ");
        System.out.println("Room number: " + RoomC.getRoomNumber());
        System.out.println("Room type: " + RoomC.getRoomType());
        System.out.println("Vacancy: " + RoomC.getVacant());
        System.out.println("Room status: " + RoomC.getRate());

    }
    
}
