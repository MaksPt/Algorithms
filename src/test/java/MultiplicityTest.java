import org.junit.jupiter.api.*;

public class MultiplicityTest {
    Multiplicity multiplicity;

    @BeforeEach
    void setUp() {
        multiplicity = new Multiplicity();
    }

    @Test
    public void testMultiplicityMultipleOfThreeAndFive() {
        int M = 15;
        String expectedResult = "Good Number";

        String actualResult = multiplicity.Multiplicity(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityMultipleOfThreeAndNotOfFive() {
        int M = -3;
        String expectedResult = "Bad Number";

        String actualResult = multiplicity.Multiplicity(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityMultipleOfFiveAndNotOfThree() {
        int M = 20;
        String expectedResult = "Poor Number";

        String actualResult = multiplicity.Multiplicity(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicitySatisfyAnyOfTheAboveConditions() {
        int M = -22;
        String expectedResult = "-1";

        String actualResult = multiplicity.Multiplicity(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
