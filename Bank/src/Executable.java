import java.math.BigDecimal;

interface Executable {
    Deposit execute(BigDecimal amount, int period);
}