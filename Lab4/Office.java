public class Office 
{
    // variables for office class
    public static int nextOffice = 100;
    private int officeNum;
    private int numOfEmployees=0;
    private Employee[] employees = new Employee[2];

    //constructor for office class
    public Office()
    {
        setOfficeNum(nextOffice);
        nextOffice ++;
    }



    // setters and getters for this class

    public int getofficeNum()
    {
        return officeNum;
    }

    public void setOfficeNum(int officeNum)
    {
        this.officeNum = officeNum;
    }

    public int getnumOfEmployees()
    {
        return numOfEmployees;
    }

    public void setnumOfEmployees(int numOfEmployees)
    {
        this.numOfEmployees = numOfEmployees;
    }

    public Employee[] getEmployees()
    {
        return employees;
    }

    public void setEmployees(Employee[] employees)
    {
        this.employees = employees;
    }



    public void addEmployee(Employee employee) // adding another employee to and office method
    {
        if(numOfEmployees <=2) //number of employees per office is 2 at max 
        {                       // if its less than or equal to 2 it can add another and changes the number of employees
            employees[numOfEmployees] = employee;
            numOfEmployees ++;
        }
        else 
        {                       // else theres more than 2 so outputs not able to add more/ reached the max
            System.out.println("You've reached max number of employees!!");
        }
    }

    public String printEmployee()
    {
        String employeeDetails = " "; // initialises empty string to store combined details
        for (Employee emp:employees) // iterate over each employee object 
        {
            if(emp!=null) // check if its null to prevent null pointer exception
            {
                // printing details 
                employeeDetails += emp.getemployeeNumber() + " " + emp.getfirstName() + " " + emp.getlastName();
            }
        }
        return employeeDetails; // returning the details 

    }

    //tostring method to print the result as a string 

    public String toString()
    {
        return "Office Details: Number= " + officeNum;
    }
}
