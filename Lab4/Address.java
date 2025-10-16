public class Address 
{
    // variables for Address Class
    private String street;
    private String town;
    private String county;

    public Address(String street, String town, String county ) // the constructor
    {
        setStreet(street);
        setTown(town);
        setCounty(county);
    }

    // getters and setters for this Address class

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getTown()
    {
        return town;
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    // to string method to print output as a string

    public String toString()
    {
        return "Address is: Street: " + street + " Town/City: " + town + " County: " + county;
    }
}
