// Student Name:    Kamile Kacinskaite
// Student ID:      C00312390
// Date:            12/10/25
// Purpose:         Lab3 Q3

public class SavingsAccDriver
{
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(); // create first savings account object
        saver1.setsavingsBalance(2000.00); // set initial balance 

        SavingsAccount saver2 = new SavingsAccount(); // second savings account 
        saver2.setsavingsBalance(3000.00); // initial balance 

        SavingsAccount.ModifyInterestRate(0.04); // set annual interest rate to 4% for all accounts 

        saver1.calculateMonthlyInterest(); // calculate and apply one months interest to both accounts
        saver2.calculateMonthlyInterest();

        System.out.println(saver1); // print balances
        System.out.println(saver2.toString());


        SavingsAccount.ModifyInterestRate(0.05); // now set annual interest rate to 5% for all accounts 

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1);
        System.out.println(saver2.toString());


        BankCustomer BC = new BankCustomer("Kamile ", "Wexford");
        BC.AddAcc(saver1);
        BC.AddAcc(saver2);

        System.out.println(BC);
        System.out.println("Savings in total: " + BC.balance(BC.getSavingsAccs()));

    }
}