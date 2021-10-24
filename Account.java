import java.util.Date;

public class Account 
{
    private int id;
    private double balance;
    private double annualIntersetRate;
    private Date dateCreated;
    
    public Account()
    {
        id = 0;
        balance = 0;
        annualIntersetRate = 0;
    }
    public Account(int _id , double _balance)
    {
        id = _id;
        balance = _balance;
    }
    public void setId(int newId)
    {
        id = newId;
    }
    public int getId()
    {
        return id;
    }
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setAnnualIntersetRate(double AIR)
    {
        annualIntersetRate = (balance*AIR)/100;
    }
    public String DateCreated()
    {
        dateCreated = new Date();
        return dateCreated.toString();
    }
    public double getMonthlyIntersetRate()
    {
        return annualIntersetRate/12;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public void deposut(double amount)
    {
        balance += amount;
    }
}
