// RoadVehicle class that implements the importduty interface
public class RoadVehicle implements ImportDuty 
{

    // variables
    private int wheels;       
    private int passengers;   

    // constructor
    public RoadVehicle() 
    {
        this(0, 0);
    }

    // constructor 
    public RoadVehicle(int w, int p) 
    {
        setWheels(w);
        setPass(p);
    }

    // setters and getters
    public void setWheels(int num)
    {
       wheels = num;
    } 

    public int getWheels()
    {
        return wheels;
    }

    public void setPass(int num) 
    { 
        passengers = num; 
    }
    public int getPass() 
    { 
        return passengers; 
    }

    public double calculateDuty() 
    {
        return 0;
    }
}
