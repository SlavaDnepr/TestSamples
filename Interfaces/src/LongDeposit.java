import java.math.BigDecimal;
import java.math.RoundingMode;

public final class LongDeposit extends Deposit implements Prolongable {

    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        BigDecimal totalAmount = amount;
        for (int i = 7; i <= period; i++) {
            BigDecimal interest = totalAmount.divide(new BigDecimal(100)).multiply(new BigDecimal(15)).setScale(4, RoundingMode.HALF_EVEN);
            totalAmount = totalAmount.add(interest);
        }

        return totalAmount.subtract(amount).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public boolean canToProlong() {
        return false;
    }

    @Override
    public int compareTo(Deposit o) {
        return 0;
    }
}