package codes.hanno.financial;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculator {
    public static BigDecimal calculateCompoundInterest(BigDecimal principal, double rate, int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Years cannot be negative");
        }

        return principal.multiply(new BigDecimal(Math.pow(1 + rate, years))).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculatePassiveIncome(BigDecimal principal, double rate, int years) {
        if (years == 0) {
            return BigDecimal.ZERO;
        }

        return calculateCompoundInterest(principal, rate, years).subtract(calculateCompoundInterest(principal, rate, years - 1));
    }
}
