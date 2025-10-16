public class Employee 
{
    // variables for employee class
    private String firstName;
    private String lastName;
    private Address Address;
    private String employeeType;
    private int employeeNumber;
    public static int nextStaffNum = 1000;
    private String companyCarType;


    // the constructor for the employee class
    public Employee(String firstName, String lastName, String employeeType, String companyCarType)
    {
        setfirstName(firstName);
        setlastName(lastName);
        setemployeeType(employeeType);
        setcompanyCarType(companyCarType);
        setAddress(Address);
        setemployeeNumber(nextStaffNum);
        nextStaffNum ++;
    }
    

    // getters and setters for employee class
    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getlastName()
    {
        return lastName;
    }

    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Address getAddress()
    {
        return Address;
    }

    public void setAddress(Address address)
    {
        this.Address = address;
    }

    public String getemployeeType()
    {
        return employeeType;
    }

    public void setemployeeType(String employeeType)
    {
        this.employeeType = employeeType;
    }

    public int getemployeeNumber()
    {
        return employeeNumber;
    }

    public void setemployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String companyCarType()
    {
        return companyCarType;
    }

    public void setcompanyCarType(String companyCarType)
    {
        this.companyCarType = companyCarType;
    }

    public static int numOfEmployees() // method to print each employees number 
    {
        return nextStaffNum-1000;
    }


    public String toString() // toString to print output as String
    {
        // if-statement checks if employee is a manager by comparing input with the word Manager
        if (employeeType != null && employeeType.toLowerCase().equals("Manager"))
        {
            // if yes returns ouput along with company car
             return "Employee Details:  First Name: " + firstName + " Last Name: " 
            + lastName + " Address: " + Address + " Employee number: " + employeeNumber +
            " Employee type: " + employeeType + " Company car: " + companyCarType;
        }
        else 
        {
            // else not returns output without company car 
              return "Employee Details:  First Name: " + firstName + " Last Name: " 
            + lastName + " Address: " + Address + " Employee number: " + employeeNumber +
            " Employee type: " + employeeType;
        }
    }
}

