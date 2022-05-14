import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    MinMaxAve minMaxAve;

    @BeforeEach
    void setUp() {

        minMaxAve = new MinMaxAve();
    }

    @Test
    public void testMinMaxAveHappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 7;
        int end = 1;
        int[] expectedResult = {2, 8, 5};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNegativeStartInt() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = -6;
        int end = 2;
        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNegativeEndInt() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = -2;
        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveStartMoreEndInt() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 6;
        int end = 2;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveArrayEmpty() {
        int[] array = {};
        int start = 6;
        int end = 2;
        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveOneIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int end = 0;
        int[] expectedResult = {1, 1, 1};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveZeroAverage() {
        int[] array = {-100, -2, -3, -4, 4, 3, 2, 100};
        int start = 0;
        int end = 7;
        int[] expectedResult = {-100, 100, 0};

        int[] actualResult = minMaxAve.minMaxAve(array, start, end);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
