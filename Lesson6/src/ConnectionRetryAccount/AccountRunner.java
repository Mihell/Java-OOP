package ConnectionRetryAccount;

public class AccountRunner {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++) {
            ConnectionRetryAccount firstAccount = new ConnectionRetryAccount(
                    new RandomAccount(0.2, 0.2, 0.3), 4);
            try {
                firstAccount.withdraw(20);
            } catch (AccountException e) {
                e.printStackTrace();
            }
        }
    }
}
