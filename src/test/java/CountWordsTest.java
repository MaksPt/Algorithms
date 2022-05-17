import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountWordsTest {
    CountWords countWords;

    @BeforeEach
    void setUp() {
        countWords = new CountWords();
    }

    @Test
    public void testCountWordsHappyPath() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "Java";
        int expectedResult = 5;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsHappyPathTwo() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "version";
        int expectedResult = 2;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsFirstWord() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "As";
        int expectedResult = 1;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsLastWord() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "upgrades";
        int expectedResult = 1;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsIsZero() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "Hello";
        int expectedResult = 0;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrOneIsEmpty() {
        String str1 = "";
        String str2 = "Hello";
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrTwoIsEmpty() {
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the " +
                "current long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String str2 = "";
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrOneAndTwoAreEmpty() {
        String str1 = "";
        String str2 = "";
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrOneAndTwoAreNull() {
        String str1 = null;
        String str2 = null;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrOneIsNull() {
        String str1 = null;
        String str2 = "Hello";
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsStrTwoIsNull() {
        String str1 = "Hello";
        String str2 = null;
        int expectedResult = Integer.MIN_VALUE;

        int actualResult = countWords.countWords(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
