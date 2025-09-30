// Student Name 	: Kamile Kacinskaite
// Student Id Number: C00312390
// Date 			: 30/09/25
// Purpose 			: Lab2Q4

public class HotelRoomTest // test class for HotelRoom class
{
    public static void main(String[] args) 
    {
        HotelRoom RoomA = new HotelRoom(); // instance created of HotelRoom named RoomA
        RoomA.setRoomNumber(200); // set room number for RoomA to be 200
        RoomA.setRoomType("single"); // set room type for RoomA to be single
        RoomA.setRate(100.0); // set Rate to be 100.0
        RoomA.setOccupied(false); // set Occupied to be false
        
        if(!RoomA.isOccupied()) // check if room a is not currently occupied
        {
            RoomA.setOccupied(false); // since room is free mark as free
            System.out.println("Room A is successfully booked!"); // booking successful
        }
        else{
            System.out.println("Room A is already booked. Try another room."); // room already occupied inform booking was unsuccessful
        }

        HotelRoom RoomB = new HotelRoom(); // another instance of HotelRoom named RoomB
        RoomB.setRoomNumber(201); // setting room number for RoomB to be 201
        RoomB.setRoomType("double"); // then setting the type to be double
        RoomB.setRate(80); // set Rate of RoomB to be 80.0
        RoomB.setOccupied(true); // set Occupied to be true

        
        if(!RoomB.isOccupied())  // check if room a is not currently occupied
        {
            RoomB.setOccupied(true);  // since room is booked mark as booked
            System.out.println("Room B is successfully booked!");// booking successful
        }
        else{
            System.out.println("Room B is already booked. Try another room.");// room already occupied inform booking was unsuccessful
        }

        HotelRoom RoomC = new HotelRoom(); // another instance of HotelRoom named RoomC
        RoomC.setRoomNumber(202); // setting room number for RoomC to be 202
        RoomC.setRoomType("single"); // then setting the type to be single
        RoomC.setRate(90); // set Rate of RoomB to be 90.0
        RoomC.setOccupied(false); // set Occupied to false

        
        if(!RoomC.isOccupied())// check if room a is not currently occupied
        {
            RoomC.setOccupied(false);// since room is free mark as free
            System.out.println("Room C is successfully booked!");// booking successful
        }
        else{
            System.out.println("Room C is already booked. Try another room.");// room already occupied inform booking was unsuccessful
        }

        // output details for RoomA using getter methods from HotelRoom Class
        System.out.println("Room A : "); // 
        System.out.println("Room number: " + RoomA.getRoomNumber());
        System.out.println("Room type: " + RoomA.getRoomType());
        System.out.println("Rate: " + RoomA.getRate());
        System.out.println("Occupancy: " + RoomA.isOccupied());


        // output details for RoomB using similar getter methods
        System.out.println("Room B : ");
        System.out.println("Room number: " + RoomB.getRoomNumber());
        System.out.println("Room type: " + RoomB.getRoomType());
        System.out.println("Rate: " + RoomB.getRate());
        System.out.println("Occupancy: " + RoomB.isOccupied());

        // output details for RoomC using similar getter methods
        System.out.println("Room C : ");
        System.out.println("Room number: " + RoomC.getRoomNumber());
        System.out.println("Room type: " + RoomC.getRoomType());
        System.out.println("Rate: " + RoomC.getRate());
        System.out.println("Occupancy: " + RoomC.isOccupied());

    }
    
}
