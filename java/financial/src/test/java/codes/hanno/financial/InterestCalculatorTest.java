package codes.hanno.financial;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static codes.hanno.financial.InterestCalculator.calculateCompoundInterest;
import static codes.hanno.financial.InterestCalculator.calculatePassiveIncome;

class InterestCalculatorTest implements WithAssertions {

    @Nested
    class CompoundInterest {
        @Test
        void calculateCompoundInterest_forPositiveRate_returnsTheRightAmount() {
            BigDecimal actual = calculateCompoundInterest(new BigDecimal(1000.0), 0.05, 30);

            assertThat(actual).isEqualTo(new BigDecimal(4321.94));
        }

        @Test
        void calculateCompoundInterest_forNegativeRate_returnsTheRightAmount() {
            BigDecimal actual = calculateCompoundInterest(new BigDecimal(-100.0), -0.05, 30);

            assertThat(actual).isEqualTo(new BigDecimal(-21.46));
        }

        @Test
        void calculateCompoundInterest_forNegativeYears_throwsException() {
            assertThatThrownBy(() -> calculateCompoundInterest(new BigDecimal(1000.0), 0.05, -3))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Years cannot be negative");
        }
    }

    @Nested
    class PassiveIncome {
        @Test
        void calculatePassiveIncome_forPositiveRate_returnsTheRightAmount() {
            BigDecimal actual = calculatePassiveIncome(new BigDecimal(1000.0), 0.05, 30);

            assertThat(actual).isEqualTo(new BigDecimal(205.80));
        }

        @Test
        void calculatePassiveIncome_forNegativeRate_returnsTheRightAmount() {
            BigDecimal actual = calculatePassiveIncome(new BigDecimal(100.0), -0.05, 30);

            assertThat(actual).isEqualTo(new BigDecimal(-1.13));
        }

        @Test
        void calculatePassiveIncome_forNegativeYears_throwsException() {
            assertThatThrownBy(() -> calculatePassiveIncome(new BigDecimal(1000.0), 0.05, -3))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Years cannot be negative");
        }

        @Test
        void calculatePassiveIncome_forYearZero_returnsZero() {
            BigDecimal actual = calculatePassiveIncome(new BigDecimal(1000.0), 0.05, 0);

            assertThat(actual).isEqualTo(BigDecimal.ZERO);
        }
    }
}