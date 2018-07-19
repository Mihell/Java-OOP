package ConnectionRetryAccount;

public class RandomAccount implements Account {
    private double notEnoughFundsChance;
    private double accountExpiredChance;
    private double accountConnectionChance;

    public RandomAccount(double notEnoughFundsChance, double accountExpiredChance, double accountConnectionChance) {
        if(notEnoughFundsChance + accountExpiredChance + accountConnectionChance > 1){
            throw new IllegalArgumentException("too high chances");
        }
        this.notEnoughFundsChance = notEnoughFundsChance;
        this.accountExpiredChance = accountExpiredChance;
        this.accountConnectionChance = accountConnectionChance;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        double n = Math.random();
        if(n < notEnoughFundsChance){
            throw new NotEnoughFundsException("Not enough funds!");
        }
        if(n >= notEnoughFundsChance && n < notEnoughFundsChance + accountExpiredChance){
            throw new AccountExpiredException("Your account is expired!");
        }
        if(n >= notEnoughFundsChance + accountExpiredChance && n < accountConnectionChance + notEnoughFundsChance + accountExpiredChance){
            throw new AccountConnectionException("Bad connection");
        }
        System.out.println("Witdraw of " + money + " dollars is success!");

    }
}
