// Hgv class that extends RoadVehicle and implements the importduty interface
public class Hgv extends RoadVehicle implements ImportDuty 
{

    // variables
    private int cargo;
    private double value;   // added so i can calculate import duty

    public Hgv() 
    {
        this(0, 0, 0, 0);
    }

    public Hgv(int c, int w, int p) 
    {
        this(c, w, p, 0);
    }

    // new constructor including the values
    public Hgv(int c, int w, int p, double value) 
    {
        super(w, p);
        setCargo(c);
        this.value = value;
    }

    // setters and getters
    public void setCargo(int size) 
    {
        cargo = size;
    }

    public int getCargo() 
    {
        return cargo;
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
        return value * HGVTAXRATE;    // from the ImportDuty interface
    }
}
