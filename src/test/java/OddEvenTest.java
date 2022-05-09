import org.junit.jupiter.api.*;

public class OddEvenTest {
    OddEven oddEven;

    @BeforeEach
    void setUp() {

        oddEven = new OddEven();
    }

    @Test
    public void testOddEvenNegativeOdd() {
        int a = -345;
        String expectedResult = "Odd";

        String actualResult = oddEven.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenZeroEven() {
        int a = 0;
        String expectedResult = "Even";

        String actualResult = oddEven.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenEven() {
        int a = 222222;
        String expectedResult = "Even";

        String actualResult = oddEven.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenUndefinedMaxMin() {
        int a = Integer.MAX_VALUE + 1;
        String expectedResult = "Undefined";

        String actualResult = oddEven.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenUndefinedMinMax() {
        int a = Integer.MIN_VALUE - 1;
        String expectedResult = "Undefined";

        String actualResult = oddEven.oddEven(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
