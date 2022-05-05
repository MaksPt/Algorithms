import org.junit.jupiter.api.*;

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

        int[] actualResult = oddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEmpty() {
        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = oddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesEvenIndexes() {
        int[] array = {-46};
        int[] expectedResult = {};

        int[] actualResult = oddIndices.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
