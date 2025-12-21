package task4;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Deposited $" + amount);
    }
}
