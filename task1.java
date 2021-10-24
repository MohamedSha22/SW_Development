public class task1 
{
    public static void main(String[] args) 
    {
        Account a1 = new Account(1122,20000);
        a1.setAnnualIntersetRate(4.5);
        a1.withdraw(2500);
        a1.deposut(3000);
        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthlyIntersetRate());
        System.out.println(a1.DateCreated());
    }   
}
