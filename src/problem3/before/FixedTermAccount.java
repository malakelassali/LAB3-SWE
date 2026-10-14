package problem3.before;

public class FixedTermAccount extends Account {
    public FixedTermAccount(double balance) { super(balance); }
    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Locked until maturity");
    }
}
