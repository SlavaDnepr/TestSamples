import java.math.BigDecimal;
import java.math.RoundingMode;

public class Client {

    private Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }

        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal totalIncome = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);

        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] != null)
                totalIncome = totalIncome.add(deposits[i].income());
            else
                break;

        return totalIncome;
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] != null) {
                BigDecimal currentIncome = deposits[i].income();
                if (currentIncome.compareTo(maxIncome) > 0)
                    maxIncome = currentIncome;
            }
            else
                break;

        return maxIncome;
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (number > 9 || deposits[number] == null)
            return BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);

        return deposits[number].income();
    }
}
