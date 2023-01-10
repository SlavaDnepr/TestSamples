import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit> {
    protected final BigDecimal amount;

    protected final int period;

    protected Deposit(BigDecimal depositAmount, int depositPeriod){
        if (depositAmount.compareTo(new BigDecimal(0)) <= 0 || depositPeriod <= 0)
            throw new IllegalArgumentException();

        amount = depositAmount;
        period = depositPeriod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public abstract BigDecimal income();
}