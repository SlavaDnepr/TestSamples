import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("E", new BigDecimal(100));
        employees[1] = new SalesPerson("S", new BigDecimal(200), 50);
        employees[2] = new Manager("M", new BigDecimal(300), 50);
        Company company = new Company(employees);
        company.giveEverybodyBonus(new BigDecimal(100));
        // 100 + 100
        // 200 + 100
        // 300 + 100
        // 900
        BigDecimal totalToPay = company.totalToPay();
        System.out.println(totalToPay);
    }
}