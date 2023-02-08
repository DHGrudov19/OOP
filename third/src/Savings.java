public class Savings extends Account {
    private double interestRate = 0.008;

    public Savings(double balance) {
        this.balance = balance;
    }

    public void Withdraw(double amount)
    {
        balance = balance - amount+amount*interestRate;
    }
    public void Deposit(double amount)
    {
        balance = balance + amount+amount*interestRate;
    }
    public void printBalance()
    {
        System.out.println(balance);
    }
}
