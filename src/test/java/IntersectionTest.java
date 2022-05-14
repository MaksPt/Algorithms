import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    Intersection intersection;

    @BeforeEach
    void setUp() {
        intersection = new Intersection();
    }

    @Test
    public void testIntersectionIndexesOfArray1MoreThanArray2() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionIndexesOfArray1MoreThanArray2AndNegativeNumbers() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionNonIntersectionNumbers() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionEmptyFirstArray() {
        int[] array1 = {};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionEmptySecondArray() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {};
        int[] expectedResult = {};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionDuplicatesInArrays() {
        int[] array1 = {1, 1, 2, 2, 3};
        int[] array2 = {1, 1, 1, 2, 2, 2, 3, 5, 6};
        int[] expectedResult = {1, 2, 3};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionDuplicatesAndNegativeNumbers() {
        int[] array1 = {-1, -1, -1, -2, -2, 2, -3, 5, 6};
        int[] array2 = {1, 1, 2, 2, -3};
        int[] expectedResult = {2, -3};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionNegativeDuplicateNumbers() {
        int[] array1 = {-1, -1, -1};
        int[] array2 = {-1, -1, -1};
        int[] expectedResult = {-1};

        int[] actualResult = intersection.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
