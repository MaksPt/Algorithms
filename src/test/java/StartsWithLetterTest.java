import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartsWithLetterTest {
    StartsWithLetter startsWithLetter;

    @BeforeEach
    void setUp() {
        startsWithLetter = new StartsWithLetter();
    }

    @Test
    public void testStartsWithLetterHappyPath(){
        String str1 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.\n";

        String expectedResult = "lame, love, lame, live, Look";

        String actualResult = startsWithLetter.startsWithLetter(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testStartsWithLetterHappyPathTwo(){
        String str1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the " +
                "legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";

        String expectedResult = "latest, long-term, LTS, last, legacy, LTS";

        String actualResult = startsWithLetter.startsWithLetter(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testStartsWithLetterAreNotStartsWithLetter(){
        String str1 = "As of March 2022, Java 18 is the version, while Java 17, 11 and 8 are the current " +
                "support versions. Oracle released the zero-cost public update for the " +
                "version Java 8 in January 2019 for commercial java use, although it will otherwise still " +
                "support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";

        String expectedResult = "";

        String actualResult = startsWithLetter.startsWithLetter(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testStartsWithLetterStrOneIsEmpty(){
        String str1 = "";
        String expectedResult = "";

        String actualResult = startsWithLetter.startsWithLetter(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
