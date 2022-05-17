import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    public void testReverseStringTestHappyPath() {
        String str1 = "Abracadabra";
        String expectedResult = "arbadacarbA";

        String actualResult = reverseString.reverseString(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testReverseStringTestOneLetter() {
        String str1 = "z";
        String expectedResult = "z";

        String actualResult = reverseString.reverseString(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testReverseStringTestStrOneIsEmpty() {
        String str1 = "";
        String expectedResult = "";

        String actualResult = reverseString.reverseString(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testReverseStringTestStrOneIsNull() {
        String str1 = null;
        String expectedResult = "";

        String actualResult = reverseString.reverseString(str1);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
