import java.math.BigDecimal;
import java.math.RoundingMode;

public final class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal subAmount = amount;
        for (int i = 1; i <= period; i++) {
            BigDecimal interest = subAmount.divide(new BigDecimal(100)).multiply(new BigDecimal(i)).setScale(4, RoundingMode.HALF_EVEN);
            subAmount = subAmount.add(interest);
        }

        return subAmount.subtract(amount).setScale(2, RoundingMode.DOWN);
    }
}
