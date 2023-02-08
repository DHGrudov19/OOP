public class Main {
    public static void main(String[] args) {
        Account obj = new Savings(50000);
        obj.Deposit(1000);
        obj.printBalance();

        obj.Withdraw(3000);
        obj.printBalance();

        System.out.println();

        Account obj1 = new Current(50000);
        obj1.Deposit(1000);
        obj1.printBalance();

        obj1.Withdraw(3000);
        obj1.printBalance();

    }
}
