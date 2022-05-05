import org.junit.jupiter.api.*;

public class KthLargestTest {
    KthLargest kthLargest;

    @BeforeEach
    void setUp() {
        kthLargest = new KthLargest();
    }

    @Test
    public void KthLargestHappyPath() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestMaxValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 1;
        int expectedResult = 12;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestMinValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = array.length;
        int expectedResult = 2;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestMoreThanMaxValue() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = array.length + 1;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestEmptyArrayAndZeroKth() {
        int[] array = {};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestValidArrayZeroKth() {
        int[] array = {4, 3, 7, 12};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestValidArrayNegativeKth() {
        int[] array = {4, 3, 7, 12};
        int k = -5;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void KthLargestEmptyArrayValidKth() {
        int[] array = {};
        int k = 5;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = kthLargest.KthLargest(array,k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

/**






 **/



}
