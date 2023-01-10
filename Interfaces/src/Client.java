import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Client implements Iterable<Deposit> {

    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public Client(Deposit[] deposits) {
        if (deposits == null)
            throw new IllegalArgumentException();

        this.deposits = deposits;
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
        BigDecimal totalIncome = new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN);

        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] != null)
                totalIncome = totalIncome.add(deposits[i].income());
            else
                break;

        return totalIncome;
    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN);
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
            return new BigDecimal(0).setScale(2, RoundingMode.HALF_EVEN);

        return deposits[number].income();
    }

    @Override
    public Iterator<Deposit> iterator() {
        return null;
    }

    public void sortDeposits() {
    }

    public int countPossibleToProlongDeposit() {
        return 0;
    }
}
