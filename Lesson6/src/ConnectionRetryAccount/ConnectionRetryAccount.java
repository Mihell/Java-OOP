package ConnectionRetryAccount;

public class ConnectionRetryAccount implements Account {
    private Account account;
    private int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }

    @Override
    public void withdraw(long money) throws AccountException{
            try{
                account.withdraw(money);
            } catch (AccountConnectionException e){
                if(retries > 0){
                    retries--;
                    withdraw(money);
                } else {
                    throw new AccountConnectionException("Bad connection");
                }
            }

    }
}
