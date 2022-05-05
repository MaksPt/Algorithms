import org.junit.jupiter.api.*;

public class AreNumbersEqualTest {
    AreNumbersEqual areNumbersEqual;

    @BeforeEach
    void setUp() {
        areNumbersEqual = new AreNumbersEqual();
    }

    @Test
    public void testAreNumbersEqualFirstNumberEqualSecondNumber() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = areNumbersEqual.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualFirstNumberLessThanSecondNumber() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = areNumbersEqual.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualFirstNumberBiggerThanSecondNumber() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = areNumbersEqual.AreNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
