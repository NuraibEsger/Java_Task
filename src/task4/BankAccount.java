package task4;

public abstract class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
}
