public class Account
{
    private double accountBal;
    private double number;

    public Account()
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
