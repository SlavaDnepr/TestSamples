import java.math.BigDecimal;

public abstract class Deposit {
    public BigDecimal getAmount() {
        return BigDecimal.ZERO;
    }

    public int getPeriod() {
        return 0;
    }

    public BigDecimal income() {
        return BigDecimal.ZERO;
    }
}
