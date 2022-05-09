import org.junit.jupiter.api.*;

public class StringToLettersTest {
    StringToLetters stringToLetters;

    @BeforeEach
    void setUp() {
        stringToLetters = new StringToLetters();
    }
    @Test
    public void StringToLettersHappyPath() {
        String str1 = "AaBqWzZ";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void StringToLettersCyrillicAlphabet() {
        String str1 = "AaЁеКлМнЯя";
        String expectedResult = "AaЁеКлМнЯя";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void StringToLettersLettersWithNumbers() {
        String str1 = "AaBqWzZ12309-5";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void StringToLettersLettersWithNumbersAndSymbolsAndSpaces() {
        String str1 = "AaBqWzZ12309-5 ~)9&^%$#!@-*/+ ?.>,}]{[";
        String expectedResult = "AaBqWzZ";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void StringToLettersOnlyNumbersAndSymbolsAndSpaces() {
        String str1 = "12309-5 ~)9&^%$#!@-*/+ ?.>,";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void StringToLettersLengthZero() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
