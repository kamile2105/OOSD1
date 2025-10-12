public class SavingsAccount 
{
    // variable initialisations
    private int AccountNumber; // instance variable to store account number for each object
    private static int nextAccountNumber = 0;

    private double savingsBalance; // indicating the amount the saver currently has on deposit
    private static double annualInterestRate = 0.0;
    
    public SavingsAccount() // default constructor 
    {
        nextAccountNumber ++;  // counting upwards incrementing by 1 for each number
        setAccountNumber(nextAccountNumber); // set that number to the instance
    }

    public SavingsAccount(double savingsBalance) // constructor with intital balance
    {
        nextAccountNumber ++; // increment 
        setAccountNumber(nextAccountNumber); // asign new number
        setsavingsBalance(savingsBalance); // set the balance
    }

    public static void ModifyInterestRate( double annualInterestRate) // modify annual interst rate for all accounts
    {
        SavingsAccount.annualInterestRate = annualInterestRate; // update the annual interest rate
    }
    

    // getter and setter methods for this class
    public int getAccountNumber()
    {
        return AccountNumber;
    }

    public void setAccountNumber(int AccountNumber)
    {
        this.AccountNumber = AccountNumber;
    }

    public static double getannualInterestRate() // static getter
    {
        return annualInterestRate;
    }

    
    public static void setannualInterestRate( double annualInterestRate) // static setter 
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getsavingsBalance()
    {
        return savingsBalance;
    }

    public void setsavingsBalance( double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() // method to calculate monthly interst rate to the savings balance
    {
        savingsBalance += ((getsavingsBalance() * getannualInterestRate()) / 12); // the formula 
    }

    public String toString() // overridden toString method to return account details as a string
    {
        return "Savings Account: AccountNumber =" + AccountNumber + ", Savings Balance = " + savingsBalance + "";
    }


}
