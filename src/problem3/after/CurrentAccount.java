package problem3.after;

public class CurrentAccount implements WithdrawableAccount {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance= balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance+= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient funds"
            );
        }
        balance -= amount;
    }
}
