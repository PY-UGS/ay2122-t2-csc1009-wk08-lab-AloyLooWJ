import java.util.Scanner;
public class Q2Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        double deposit = input.nextDouble();
        
        if (deposit < 0)
        {
            input.close();
            throw new IllegalArgumentException("Amount must be a positive number");
        }
        else
        {
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter amount to withdraw: ");
            double withdraw = input2.nextDouble();
            input.close();
            input2.close();
            if (withdraw < 0)
            {
                throw new IllegalArgumentException("Amount must be a positive number");
            }
            else
            {
                Q2Account myAccount = new Q2Account();
                myAccount.deposit(deposit);
                double balance = myAccount.getBalance();
                double number = myAccount.getNumber(withdraw);
                try
                {
                    checkAccount(balance, withdraw, number);
                    myAccount.withdraw(withdraw);
                    balance = myAccount.getBalance();
                    System.out.println("The balance after withdraw is: $" + balance);
                }
                catch (MyException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static boolean checkAccount(double balance, double withdraw, double number) throws MyException
    {
        if (balance < withdraw) throw new MyException("Sorry, but your account is short by: $" + number);
        return true;
    }
}

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}
