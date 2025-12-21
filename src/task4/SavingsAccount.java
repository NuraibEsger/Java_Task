package task4;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Deposited " + amount + " from savings account");
        } else  {
            System.out.println("Insufficient funds!");
        }
    }
}
