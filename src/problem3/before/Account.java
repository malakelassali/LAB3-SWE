package problem3.before;

public class Account {
    protected double balance;
    public Account(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }
    public double getBalance() { return balance; }
}
