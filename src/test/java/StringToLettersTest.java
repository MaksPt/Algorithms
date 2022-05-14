import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {
    StringToLetters stringToLetters;

    @BeforeEach
    void setUp() {
        stringToLetters = new StringToLetters();
    }
    @Test
    public void testStringToLettersHappyPath() {
        String str1 = "AaBqWzZ";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testStringToLettersCyrillicAlphabet() {
        String str1 = "AaЁеКлМнЯя";
        String expectedResult = "AaЁеКлМнЯя";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testStringToLettersLettersWithNumbers() {
        String str1 = "AaBqWzZ12309-5";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testStringToLettersLettersWithNumbersAndSymbolsAndSpaces() {
        String str1 = "AaBqWzZ12309-5 ~)9&^%$#!@-*/+ ?.>,}]{[";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testStringToLettersOnlyNumbersAndSymbolsAndSpaces() {
        String str1 = "12309-5 ~)9&^%$#!@-*/+ ?.>,";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testStringToLettersLengthZero() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
