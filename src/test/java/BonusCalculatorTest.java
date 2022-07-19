import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusCalculatorTest {

    @org.junit.jupiter.params.ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void shouldCalculateAll(int amount, boolean isRegistered, long expected) {
        BonusCalculator service = new BonusCalculator();

        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected,actual);


    }
}
