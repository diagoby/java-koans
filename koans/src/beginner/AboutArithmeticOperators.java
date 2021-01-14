package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutArithmeticOperators {

    @Koan
    public void simpleOperations() {
        final int ONE = 1;
        final int ONE_PLUS_ONE = 2;
        final int THREE_TIMES_FOUR_PLUS_TWO = 14;
        final int TWO_PLUS_THREE_TIMES_FOUR = 20;
        final int TWO_TIMES_THREE_PLUS_FOUR = 10;
        final int TWO_MINUS_THREE_PLUS_FOUR = 3;
        final int FOUR_DIVIDED_BY_TWO_PLUS_TWO = 4;
        final int TWO_PLUS_FOUR_DIVIDED_BY_TWO = 3;

        assertEquals(1, ONE);
        assertEquals(1 + 1, ONE_PLUS_ONE);
        assertEquals(2 + 3 * 4, THREE_TIMES_FOUR_PLUS_TWO);
        assertEquals((2 + 3) * 4, TWO_PLUS_THREE_TIMES_FOUR);
        assertEquals(2 * 3 + 4, TWO_TIMES_THREE_PLUS_FOUR);
        assertEquals(2 - 3 + 4, TWO_MINUS_THREE_PLUS_FOUR);
        assertEquals(2 + 4 / 2, FOUR_DIVIDED_BY_TWO_PLUS_TWO);
        assertEquals((2 + 4) / 2, TWO_PLUS_FOUR_DIVIDED_BY_TWO);
    }

    @Koan
    public void notSoSimpleOperations() {
        final int ONE_DIVIDED_BY_TWO = 0;
        final int THREE_DIVIDED_BY_TWO = 1;
        final int ONE_MOD_TWO = 1;
        final int THREE_MOD_TWO = 1;

        assertEquals(1 / 2, ONE_DIVIDED_BY_TWO);
        assertEquals(3 / 2, THREE_DIVIDED_BY_TWO);
        assertEquals(1 % 2, ONE_MOD_TWO);
        assertEquals(3 % 2, THREE_MOD_TWO);
    }

    @Koan
    public void minusMinusVariableMinusMinus() {
        int i = 1;
        assertEquals(--i, 0);
        assertEquals(i, 0);
        assertEquals(i--, 0);
        assertEquals(i, -1);
    }

    @Koan
    public void plusPlusVariablePlusPlus() {
        int i = 1;
        assertEquals(++i, 2);
        assertEquals(i, 2);
        assertEquals(i++, 2);
        assertEquals(i, 3);
    }

    @Koan
    public void timesAndDivInPlace() {
        int i = 1;
        i *= 2;
        assertEquals(i, 2);
        i /= 2;
        assertEquals(i, 1);
    }

}
