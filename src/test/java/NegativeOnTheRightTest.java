import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {
    NegativeOnTheRight negativeOnTheRight;

    @BeforeEach
    void setUp() {
        negativeOnTheRight = new NegativeOnTheRight();
    }

    @Test
    public void testNegativeOnTheRightLastNumberIsPositive() {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightLastNumberIsNegative() {
        int[] array = {-4, -3, -7, -12, 5, -2, 9, 4, -12};
        int[] expectedResult = {5, 9, 4, -12, -2, -12, -7, -3, -4};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightOneNumber() {
        int[] array = {1};
        int[] expectedResult = {1};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
