import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    OddIndices oddIndices;

    @BeforeEach
    void setUp() {
        oddIndices = new OddIndices();
    }

    @Test
    public void testOddIndicesHappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEmpty() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEvenIndexes() {
        int[] array = {-46};
        int[] expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
