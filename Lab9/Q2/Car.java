// Car class that extends RoadVehicle and implements the importduty interface
public class Car extends RoadVehicle implements ImportDuty 
{

    // variables
    private String carType;
    private double value;  // added so we can calculate duty

    public Car() 
    {
        this("", 0, 0, 0);
    }

    public Car(String c, int w, int p) 
    {
        this(c, w, p, 0);
    }

    // new constructor including the values
    public Car(String c, int w, int p, double value) 
    {
        super(w, p);
        setType(c);
        this.value = value;
    }

    // setters and getters
    public void setType(String t) 
    {
        carType = t;
    }

    public String getType() 
    {
        return carType;
    }

    public void setValue(double v) 
    {
        value = v;
    }

    public double getValue() 
    {
        return value;
    }

    public double calculateDuty() 
    {
        return value * CARTAXRATE;   // from the ImportDuty interface
    }
}
