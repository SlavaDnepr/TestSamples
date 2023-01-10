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

    public int compareTo(Deposit o) {
        if (o == this)
            return 0;

        if (o == null)
            return 1;

        BigDecimal other = o.income().add(o.amount);
        BigDecimal current = this.income().add(this.amount);

        return current.compareTo(other);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Deposit)) {
            return false;
        }

        Deposit c = (Deposit) o;

        BigDecimal other = c.income().add(c.amount);
        BigDecimal current = this.income().add(this.amount);

        return current.compareTo(other) == 0;
    }

    public abstract boolean canToProlong();
}