import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {
    StringToLettersAndSpaces stringToLettersAndSpaces;

    @BeforeEach
    void setUp() {
        stringToLettersAndSpaces = new StringToLettersAndSpaces();
    }

    @Test
    public void testStringToLettersAndSpacesHappyPath() {
        String str1 = " A a B q W z Z ";
        String expectedResult = " A a B q W z Z ";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesCyrillicAlphabet() {
        String str1 = "A a Ё е К л М н Я я";
        String expectedResult = "A a Ё е К л М н Я я";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesLettersWithNumbers() {
        String str1 = " A a B q W z Z 1 2 309-5q";
        String expectedResult = " A a B q W z Z   q";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesOnlySpace() {
        String str1 = " ";
        String expectedResult = " ";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesLettersWithNumbersAndSymbolsAndSpaces() {
        String str1 = "A aBq WzZ12309- 5 ~)9&^%$ u#!@-*/+ ?.>,}]{[";
        String expectedResult = "A aBq WzZ   u ";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesOnlyNumbersAndSymbolsAndSpaces() {
        String str1 = "12309-5 ~)9&^%$#!@-*/+ ?.>, ";
        String expectedResult = "   ";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersAndSpacesLengthZero() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
