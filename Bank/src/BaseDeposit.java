import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BaseDeposit extends Deposit {

    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal subAmount = amount;
        for (int i = 1; i <= period; i++) {
            BigDecimal interest = subAmount.divide(new BigDecimal(20)).setScale(4, RoundingMode.HALF_EVEN);
            subAmount = subAmount.add(interest);
        }

        return subAmount.subtract(amount).setScale(2, RoundingMode.DOWN);
    }
}
