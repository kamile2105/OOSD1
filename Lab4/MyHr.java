// Student Name:    Kamile Kacinskaite
// Student ID:      C00312390
// Date:            16/10/25
// Purpose:         Lab4

import java.util.Scanner; // importing to be able to use a scanner for the driver program 
public class MyHr 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); // initialising scanner 
        int option = 0;

        Employee[] employees = new Employee[5]; // array of 5 employees
        Office [] offices = new Office[3]; // array of 3 offices

        for(int x = 0; x <= 2; x++) // this makes sure there can only  be 2 people per office
        {
            Office off = new Office();
            offices[x]=off;
        }

        while(option!=4) // while loop to iterate through each option until user decides to stop
        {
            System.out.println("Select one of the options below: ");
            System.out.println("1. List all offices");
            System.out.println("2. Create new employee record");
            System.out.println("3. List all the employees");
            System.out.println("4. Exit ");
            option = in.nextInt();
        
         switch(option) // i used a switch case for an efficient output and easier to code
         {
            case 1: // first case checks for offices/ lisitng all that are available 
            for(Office off : offices)
            {
                System.out.println(off + "Number of employees: " + off.getnumOfEmployees());
                if(off.getnumOfEmployees() != 0)
                {
                    System.out.println("Employees: " + off.printEmployee()); // prints it out to the screen when you select the first option
                }
            }
            break;

            case 2: // case two lets you create a new employee and the records for it 
            if(employees.length <= 5)  
            {
                // declaring all neccessary variables, importing another scanner and printing results to screen
                String firstName;
                String lastName;
                String street;
                String town;
                String county;
                String employeeType;
                String companyCarType = null;
                Scanner inEmp = new Scanner(System.in);
                System.out.println("Enter employee's first name: ");
                firstName = inEmp.nextLine();
                System.out.println("Enter employee's surname: ");
                lastName = inEmp.nextLine();
                System.out.println("Enter Address: Street: ");
                street = inEmp.nextLine();
                System.out.println("Enter Address: Town: ");
                town = inEmp.nextLine();
                System.out.println("Enter Address: County: ");
                county = inEmp.nextLine();
                System.out.println("Enter type of employee (Manager or Staff): ");
                employeeType = inEmp.nextLine();
                if (employeeType.toLowerCase().equals("Manager")) // checks if employee is a manager or not 
                {
                    // if yes outputs the company car that they have 
                    System.out.println("Enter type of Company Car: ");
                    street = inEmp.nextLine();
                }

                // creating new address object 
                Address add = new Address(street, town, county);
                // creating new employee object with the provided personal and job info
                Employee emp = new Employee(firstName, lastName, employeeType, companyCarType);
                // set company car type if applicable 
                emp.setcompanyCarType(companyCarType);
                // add new employees to employee array
                employees[Employee.numOfEmployees()] = emp;
                for(Office off: offices) // assigning employee to an office 
                {
                    if(off.getnumOfEmployees() <= 2) // checks if office has space 
                    {
                        off.addEmployee(emp); // add employee 
                        break; // stop searching after assigning to first available office 
                    }
                    else 
                    {
                        // else notify office is full 
                        System.out.println("Max number of employees reached, can't create any more.");
                    }
                }

            }
            break;

            case 3: // listing all the current employees 
            for (Employee emp:employees)
            {
                if(emp != null) // checks if its not empty 
                {
                    System.out.println(emp); // prints to screen
                }
            }
            break;

            case 4: // exits the program 
            System.out.println("Exiting...");
            System.exit(option);

            break;
        }

      }
        in.close(); // closed scanner 

       
    }

}
