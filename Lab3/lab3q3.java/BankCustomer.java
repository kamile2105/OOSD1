import java.util.Arrays;

public class BankCustomer 
{
    private String name;
    private String address;
    private int numOfAccs = 0;

    private SavingsAccount[] SavingsAccs = new SavingsAccount[3]; // array to store up to 3 savings accounts

    public BankCustomer(String name, String address) // constructor to create new bank customer 
    {
        setName(name);
        setAddress(address);
    }


    // getters and setters for this class
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public SavingsAccount[] getSavingsAccs()
    {
        return SavingsAccs;
    }

    public void setSavingsAccs(SavingsAccount[] SavingsAccs)
    {
        this.SavingsAccs = SavingsAccs;
    }

    public int getnumOfAccs()
    {
        return numOfAccs;
    }

    public void setnumOfAccs(int numOfAccs)
    {
        this.numOfAccs = numOfAccs;
    }


    public void AddAcc(SavingsAccount sav) // method to add new savings account to customers account list
    {
        if(getnumOfAccs() <= 2) // allow max of 3 accounts 
        {
            SavingsAccs[getnumOfAccs()] = sav; // add amount to next available position 
            setnumOfAccs(getnumOfAccs()+1); // increment
        } 
        else // if limit is reached print a warning 
        {
            System.out.println("You've reached maximum number of accounts available. Try again later.");
        }
    }

    public double balance(SavingsAccount[] SavingsAccs) // method to calculate balance across all accounts 
    {
        double balance = 0;
        for (SavingsAccount sav: SavingsAccs) // loop through each account and sum up the balances (only if not null)
        {
            if(sav != null) balance += sav.getsavingsBalance();
        }
        return balance; // total balance return

    }


    public String toString() // overridden toString method to return account details as a string
    {
        return "Bank customer: Name =" + name + ", Address = " + address + " SavingsAccs = " + Arrays.toString(SavingsAccs);
    }
}
