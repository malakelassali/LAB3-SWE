package problem3.after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CurrentAccount current= new CurrentAccount(500);
        FixedTermAccount fixed= new FixedTermAccount(1000);

        List<WithdrawableAccount> accounts = new ArrayList<>();
        // accounts.add(fixed); // This will add a compilation error
        accounts.add(current);
        Bank.chargeMonthlyFee(accounts);
        System.out.println("Current account balance: " + current.getBalance());
        System.out.println("Fixed-term account balance: " + fixed.getBalance());
    }
}
