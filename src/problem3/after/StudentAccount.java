package problem3.after;

public class StudentAccount implements Account {
    private CurrentAccount account;

    public StudentAccount(double balance) {
        this.account= new CurrentAccount(balance);
    }
    @Override
    public void deposit(double amount) {
        account.deposit(amount);
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }

    public void withdraw(double amount) {
        if (amount > 200) {
            throw new IllegalArgumentException(
                    "Withdrawal limit exceeded"
            );
        }
        account.withdraw(amount);
    }
}
