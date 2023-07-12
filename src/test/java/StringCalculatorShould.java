import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private final StringCalculator stringCalculator = new StringCalculator();

    @ParameterizedTest
    @CsvSource({
            "'',0",
            "'1',1",
            "'2',2",
            "'0,1',1",
            "'1,2',3",
    })
    public void calculate_the_sum_of_the_input(String input, String result)
    {
        assertEquals(result, stringCalculator.add(input));
    }
}
