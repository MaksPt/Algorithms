import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    StringToNumbers stringToNumbers;

    @BeforeEach
    void setUp() {
        stringToNumbers = new StringToNumbers();
    }

    @Test
    public void testStringToNumbersHappyPath() {

        String str1 = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = stringToNumbers.stringToNumbers(str1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersZeroAndNegativeNumbers() {

        String str1 = "0, -10, -3, 0, 5";
        int[] expectedResult = {0, 1, 0, 3, 0, 5};

        int[] actualResult = stringToNumbers.stringToNumbers(str1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersLetterAndNumbersAndSymbols() {

        String str1 = "Hello2_ 5Wo-3Rl+=d0203";
        int[] expectedResult = {2, 5, 3, 0, 2, 0, 3};

        int[] actualResult = stringToNumbers.stringToNumbers(str1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersNoNumbers() {

        String str1 = "Hello_ Wo-Rl+=d";
        int[] expectedResult = {};

        int[] actualResult = stringToNumbers.stringToNumbers(str1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringLengthZero() {

        String str1 = "";
        int[] expectedResult = {};

        int[] actualResult = stringToNumbers.stringToNumbers(str1);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
