import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
    SortArray sortArray;

    @BeforeEach
    void setUp() {
        sortArray = new SortArray();
    }

    @Test
    public void testSortArrayPositiveNumbers() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayNegativeNumbers() {
        int[] array = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayNegativeToPositiveNumbers() {
        int[] array = {Integer.MAX_VALUE, -3, 7, 0, -10, 1, Integer.MIN_VALUE};
        int[] expectedResult = {Integer.MIN_VALUE, -10, -3, 0, 1, 7, Integer.MAX_VALUE};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayNegativeOneNumberZero() {
        int[] array = {0};
        int[] expectedResult = {0};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayNegativeSomeOneNumber() {
        int[] array = {5};
        int[] expectedResult = {5};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEqualsNumbers() {
        int[] array = {2,2,2,2};
        int[] expectedResult = {2,2,2,2};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = sortArray.sortArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}







