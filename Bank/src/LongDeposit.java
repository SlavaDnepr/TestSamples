import java.math.BigDecimal;
import java.math.RoundingMode;

public final class LongDeposit extends Deposit {
    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal subAmount = amount;
        for (int i = 7; i <= period; i++) {
            BigDecimal interest = subAmount.divide(new BigDecimal(100)).multiply(new BigDecimal(15)).setScale(4, RoundingMode.HALF_EVEN);
            subAmount = subAmount.add(interest);
        }

        return subAmount.subtract(amount).setScale(2, RoundingMode.DOWN);
    }
}
