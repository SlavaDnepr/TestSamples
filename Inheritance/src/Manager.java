import java.math.BigDecimal;
import java.math.BigInteger;

public final class Manager extends Employee {
    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);

        if (clientAmount < 0)
            throw new IllegalArgumentException();

        this.clientAmount = clientAmount;
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus == null)
            throw new IllegalArgumentException();

        super.setBonus(bonus);

        if (clientAmount > 100 && clientAmount <= 150)
            super.setBonus(bonus.add(new BigDecimal(BigInteger.valueOf(500))));

        if (clientAmount > 150)
            super.setBonus(bonus.add(new BigDecimal(BigInteger.valueOf(1000))));
    }
}
