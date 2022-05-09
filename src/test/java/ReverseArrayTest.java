import org.junit.jupiter.api.*;

public class ReverseArrayTest {
    ReverseArray reverseArray;

    @BeforeEach
    void setUp() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void testReverseArrayHappyPathEvenIndex() {
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = reverseArray.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathOddIndex() {
        int[] array = {2, 7, 5, 3, 10};
        int[] expectedResult = {10, 3, 5, 7, 2};

        int[] actualResult = reverseArray.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = reverseArray.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayOneNumber() {
        int[] array = {5};
        int[] expectedResult = {5};

        int[] actualResult = reverseArray.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
