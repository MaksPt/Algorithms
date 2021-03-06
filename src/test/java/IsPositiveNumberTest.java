import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    IsPositiveNumber isPositiveNumber;

    @BeforeEach
    void setUp() {
        isPositiveNumber = new IsPositiveNumber();
    }

    @Test
    public void testIsPositiveNumberHappyPath() {
        int a = 555;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberZero() {
        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberNegative() {
        int a = -555;
        boolean expectedResult = false;

        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberMinValue() {
        int a = Integer.MIN_VALUE;
        boolean expectedResult = false;

        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberMaxValue() {
        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
