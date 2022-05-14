import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToNumbersStringTest {
    StringToNumbersString stringToNumbersString;

    @BeforeEach
    void setUp() {
        stringToNumbersString = new StringToNumbersString();
    }

    @Test
    public void testStringToNumbersStringHappyPath() {
        String str1 = "0123456789";
        String expectedResult = "0123456789";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringNegativeNumbers() {
        String str1 = "0-1-2-34567-8-9";
        String expectedResult = "0123456789";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringLettersWithNumbersAndSpaces() {
        String str1 = " A a B q W z Z 1 2 309-5q";
        String expectedResult = "123095";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringOneNumber() {
        String str1 = "0";
        String expectedResult = "0";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringLettersWithNumbersAndSymbolsAndSpaces() {
        String str1 = "A aBq WzZ12309- 5 ~)9&^%$ u#!@-*/+ ?.>,}]{[";
        String expectedResult = "1230959";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringOnlyNumbersAndSymbolsAndSpaces() {
        String str1 = "12309-5 ~)9&^%$#!@-*/+ ?.>, ";
        String expectedResult = "1230959";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersStringLengthZero() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = stringToNumbersString.stringToNumbersString(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
