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
/*out:
ConnectionRetryAccount.NotEnoughFundsException: Not enough funds!
Witdraw of 20 dollars is success!
	at ConnectionRetryAccount.RandomAccount.withdraw(RandomAccount.java:21)
	at ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:15)
	at ConnectionRetryAccount.AccountRunner.main(AccountRunner.java:9)
ConnectionRetryAccount.AccountExpiredException: Your account is expired!
	at ConnectionRetryAccount.RandomAccount.withdraw(RandomAccount.java:24)
	at ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:15)
	at ConnectionRetryAccount.AccountRunner.main(AccountRunner.java:9)
ConnectionRetryAccount.AccountExpiredException: Your account is expired!
	at ConnectionRetryAccount.RandomAccount.withdraw(RandomAccount.java:24)
	at ConnectionRetryAccount.ConnectionRetryAccount.withdraw(ConnectionRetryAccount.java:15)
	at ConnectionRetryAccount.AccountRunner.main(AccountRunner.java:9)

Process finished with exit code 0
*/
