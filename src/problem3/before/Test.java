package problem3.before;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account(500));
        accounts.add(new FixedTermAccount(1000));

        Bank.chargeMonthlyFee(accounts);
    }
}