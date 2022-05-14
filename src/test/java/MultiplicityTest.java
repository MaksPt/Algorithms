import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicityTest {
    Multiplicity multiplicity;

    @BeforeEach
    void setUp() {
        multiplicity = new Multiplicity();
    }

    @Test
    public void testMultiplicityMultipleOfThreeAndFive() {
        int m = 15;
        String expectedResult = "Good Number";

        String actualResult = multiplicity.multiplicity(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityMultipleOfThreeAndNotOfFive() {
        int m = -3;
        String expectedResult = "Bad Number";

        String actualResult = multiplicity.multiplicity(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicityMultipleOfFiveAndNotOfThree() {
        int m = 20;
        String expectedResult = "Poor Number";

        String actualResult = multiplicity.multiplicity(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicitySatisfyAnyOfTheAboveConditions() {
        int m = -22;
        String expectedResult = "-1";

        String actualResult = multiplicity.multiplicity(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
