import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BaseDeposit extends Deposit {

    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal totalAmount = amount;
        for (int i = 1; i <= period; i++) {
            BigDecimal interest = totalAmount.divide(new BigDecimal(20)).setScale(4, RoundingMode.HALF_EVEN);
            totalAmount = totalAmount.add(interest);
        }

        return totalAmount.subtract(amount).setScale(2, RoundingMode.DOWN);
    }
}