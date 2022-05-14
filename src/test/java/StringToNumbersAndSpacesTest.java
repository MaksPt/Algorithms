import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {
    StringToNumbersAndSpaces stringToNumbersAndSpaces;

    @BeforeEach
    void setUp() {
        stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
    }

    @Test
    public void testStringToNumbersAndSpacesHappyPath() {
        String str1 = " 0 1 2 3 4 5 6 7 8 9 ";
        String expectedResult = " 0 1 2 3 4 5 6 7 8 9 ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesNegativeNumbers() {
        String str1 = "0-1-2-3 456 7-8-9";
        String expectedResult = "0123 456 789";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesLettersWithNumbersAndSpaces() {
        String str1 = " A a B q W z Z 1 2 309-5q";
        String expectedResult = "        1 2 3095";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesOneNumberOneSpace() {
        String str1 = "0 ";
        String expectedResult = "0 ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesLettersWithNumbersAndSymbolsAndSpaces() {
        String str1 = "A aBq WzZ12309- 5 ~)9&^%$ u#!@-*/+ ?.>,}]{[";
        String expectedResult = "  12309 5 9  ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesOnlyNumbersAndSymbolsAndSpaces() {
        String str1 = "12309-5 ~)9&^%$#!@-*/+ ?.>, ";
        String expectedResult = "123095 9  ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesLengthZero() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
