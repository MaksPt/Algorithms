import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicates();
    }

    @Test
    public void testRemoveDuplicatesTestHappyPath() {
        String str1 = "AABBCCaabbcc";
        String expectedResult = "abc";

        String actualResult = removeDuplicates.removeDuplicates(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesTestLettersAndNumbersInString() {
        String str1 = "AABBCCaabbcc000111115555";
        String expectedResult = "abc015";

        String actualResult = removeDuplicates.removeDuplicates(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesTestOneLetter() {
        String str1 = "A";
        String expectedResult = "a";

        String actualResult = removeDuplicates.removeDuplicates(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesTestStrOneIsEmpty() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = removeDuplicates.removeDuplicates(str1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

        @Test
        public void testRemoveDuplicatesTestStrOneIsNull() {
            String str1 = null;
            String expectedResult = "";

            String actualResult = removeDuplicates.removeDuplicates(str1);

            Assertions.assertEquals(expectedResult, actualResult);
    }
}


