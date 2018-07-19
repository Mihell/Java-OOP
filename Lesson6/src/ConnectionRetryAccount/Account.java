package ConnectionRetryAccount;

public interface Account {
    void withdraw(long money) throws AccountException;
}
