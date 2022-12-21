import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException();

        if (salary == null || salary.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException();

        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        if (this.bonus == null)
            return this.salary;
        else
            return this.salary.add(this.bonus);
    }
}
