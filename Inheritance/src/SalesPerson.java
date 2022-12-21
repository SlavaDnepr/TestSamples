import java.math.BigDecimal;

public final class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent)  {
        super(name, salary);

        if (percent < 0)
            throw new IllegalArgumentException();

        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null)
            throw new IllegalArgumentException();

        if (percent <= 100)
            super.setBonus(bonus);

        if (percent > 100 && percent <= 200)
            super.setBonus(bonus.multiply(new BigDecimal(2)));

        if (percent > 200)
            super.setBonus(bonus.multiply(new BigDecimal(3)));
    }
}
