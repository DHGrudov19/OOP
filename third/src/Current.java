public class Current extends Account {

    public Current(double balance) {
        super(50000);
    }

    public void Withdraw(double amount)
    {
        balance-=amount;
    }
    public void Deposit(double amount)
    {
        balance+=amount;
    }
    public void printBalance()
    {
        System.out.println(balance);
    }
}
