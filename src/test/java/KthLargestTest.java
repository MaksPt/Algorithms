import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KthLargestTest {
    KthLargest kthLargest;

    @BeforeEach
    void setUp() {
        kthLargest = new KthLargest();
    }

    @Test
    public void testKthLargestHappyPath() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestMaxValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 1;
        int expectedResult = 12;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestMinValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = array.length;
        int expectedResult = 2;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestMoreThanMaxValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = array.length + 1;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestEmptyArrayAndZeroKth() {
        int[] array = {};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestValidArrayZeroKth() {
        int[] array = {4, 3, 7, 12};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestValidArrayNegativeKth() {
        int[] array = {4, 3, 7, 12};
        int k = -5;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestEmptyArrayValidKth() {
        int[] array = {};
        int k = 5;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.kthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
