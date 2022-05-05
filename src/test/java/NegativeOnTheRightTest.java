import org.junit.jupiter.api.*;

public class NegativeOnTheRightTest {
    NegativeOnTheRight negativeOnTheRight;

    @BeforeEach
    void setUp() {
        negativeOnTheRight = new NegativeOnTheRight();
    }

    @Test
    public void NegativeOnTheRightLastNumberIsPositive() {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        int[] actualResult = negativeOnTheRight.NegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void NegativeOnTheRightLastNumberIsNegative() {
        int[] array = {-4, -3, -7, -12, 5, -2, 9, 4, -12};
        int[] expectedResult = {5, 9, 4, -12, -2, -12, -7, -3, -4};

        int[] actualResult = negativeOnTheRight.NegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void NegativeOnTheRightEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = negativeOnTheRight.NegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void NegativeOnTheRightOneNumber() {
        int[] array = {1};
        int[] expectedResult = {1};

        int[] actualResult = negativeOnTheRight.NegativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
