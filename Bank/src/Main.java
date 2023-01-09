import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Deposit baseDeposit = new BaseDeposit(new BigDecimal("1000"), 4);
        System.out.println(baseDeposit.income());
        Deposit specialDeposit = new SpecialDeposit(new BigDecimal("1000"), 4);
        System.out.println(specialDeposit.income());
        Deposit longDeposit = new LongDeposit(new BigDecimal("1000"), 5);
        System.out.println(longDeposit.income());
    }
}