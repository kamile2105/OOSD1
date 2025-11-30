// Kamile Kacinskaite
// C00312390
// 30/11/25
// Lab 9 Q2 



public class VehicleDriver 
{
    public static void main(String[] args) 
    {

        // creating an array of RoadVehicle objects
        RoadVehicle[] vehicles = new RoadVehicle[2];

        // creating a car (type, wheels, passengers, value)
        vehicles[0] = new Car("Saloon", 4, 5, 20000);

        // creating an HGV (cargo size, wheels, passengers, value)
        vehicles[1] = new Hgv(5000, 8, 2, 80000);

        // loop through and display all the details
        for (RoadVehicle rv : vehicles) 
            {
                System.out.println("Vehicle Type: " + rv.getClass().getSimpleName());
                System.out.println("Wheels: " + rv.getWheels());
                System.out.println("Passengers: " + rv.getPass());

                // print cargo for Hgv or carType for Car
                if (rv instanceof Car) 
                    {
                        Car c = (Car) rv;
                        System.out.println("Car Type: " + c.getType());
                        System.out.println("Value: " + c.getValue());
                    }

                if (rv instanceof Hgv) 
                    {
                        Hgv h = (Hgv) rv;
                        System.out.println("Cargo Capacity: " + h.getCargo());
                        System.out.println("Value: " + h.getValue());
                    }

            // calling the interface method
            System.out.println("Import Duty: " + rv.calculateDuty());
            System.out.println();
        }
    }
}
