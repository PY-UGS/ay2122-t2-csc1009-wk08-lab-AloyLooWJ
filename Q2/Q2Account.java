public class Q2Account
{
    private double accountBal;
    private double number;

    public Q2Account()
    {
        accountBal = 0;
    }

    public void deposit(double deposit)
    {
        accountBal += deposit;
    }

    public void withdraw(double withdraw)
    {
        accountBal -= withdraw;
    }

    public double getBalance()
    {
        return accountBal;
    }

    public double getNumber(double withdraw)
    {
        number = -(accountBal - withdraw);
        return number;
    }
}