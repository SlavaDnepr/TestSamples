import java.math.BigDecimal;

public class Company {
    private final Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null)
            throw new IllegalArgumentException();

        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (int i = 0; i < employees.length; i++)
            employees[i].setBonus(companyBonus);
    }

    public BigDecimal totalToPay() {
        BigDecimal totalToPay = BigDecimal.ZERO;

        for (int i = 0; i < employees.length; i++)
            totalToPay = totalToPay.add(employees[i].toPay());

        return totalToPay;
    }

    public String nameMaxSalary() {
        String nameMaxSalary = employees[0].getName();
        BigDecimal maxSalary = employees[0].toPay();

        for (int i = 1; i < employees.length; i++) {
            BigDecimal employeeToPay = employees[i].toPay();
            if (employeeToPay.compareTo(maxSalary) > 0) {
                maxSalary = employeeToPay;
                nameMaxSalary = employees[i].getName();
            }
        }

        return nameMaxSalary;
    }
}
