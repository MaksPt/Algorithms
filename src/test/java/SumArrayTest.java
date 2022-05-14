import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    SumArray sumArray;

    @BeforeEach
    void setUp() {
        sumArray = new SumArray();
    }

    @Test
    public void testSumArrayHappyPath() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayNegativeNumbers() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmpty() {
        int[] array = {};
        int expectedResult = 0;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayNegativePositiveNumbers() {
        int[] array = {-3, -2, -1, 0, 1, 2, 3};
        int expectedResult = 0;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayMinValue() {
        int[] array = {2147483647, 1};
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayMaxValue() {
        int[] array = {-2147483648, -1};
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = sumArray.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
