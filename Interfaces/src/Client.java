import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Client implements Iterable<Deposit> {

    private Deposit[] deposits;

    public Client() {
        this.deposits = new Deposit[10];
    }

    public Client(Deposit[] deposits) {
        if (deposits == null || deposits.length == 0)
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

    public void sortDeposits() {
        Arrays.sort(deposits, new Comparator<Deposit>() {
            @Override
            public int compare(Deposit deposit1, Deposit deposit2) {
                if (deposit1 == null)
                    return 1;

                if (deposit2 == null)
                    return -1;

                return deposit2.compareTo(deposit1);
            }
        });
    }

    public int countPossibleToProlongDeposit() {
        int count = 0;
        for (int i = 0; i < deposits.length; i++)
            if (deposits[i] != null && deposits[i].canToProlong())
                count++;

        return count;
    }

    @Override
    public Iterator<Deposit> iterator() {
        Iterator<Deposit> iterator = new Iterator<Deposit>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < deposits.length && deposits[currentIndex] != null;
            }

            @Override
            public Deposit next() {
                return deposits[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        return iterator;
    }
}
