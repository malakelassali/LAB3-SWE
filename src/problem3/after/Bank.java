package problem3.after;

import java.util.List;

public class Bank {
    public static void chargeMonthlyFee(List<WithdrawableAccount> accounts) {
        for (WithdrawableAccount a : accounts) {
            a.withdraw(10);
        }
    }
}