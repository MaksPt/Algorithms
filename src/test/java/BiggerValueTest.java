import org.junit.jupiter.api.*;

public class BiggerValueTest {
    BiggerValue biggerValue;

    @BeforeEach
    void setUp() {
        biggerValue = new BiggerValue();
    }

    @Test
    public void testBiggerValueHappyPathBiggerB() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHappyPathBiggerA() {
        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueNegativeToZero() {
        int a = Integer.MIN_VALUE;
        int b = 0;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueMinValueToMaxValue() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueEqual() {
        int a = 2;
        int b = 2;
        int expectedResult = 2;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
