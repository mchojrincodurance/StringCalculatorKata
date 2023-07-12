import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void return_0_when_the_input_is_empty() {
        assertEquals("0", stringCalculator.add(""));
    }

    @ParameterizedTest
    @CsvSource({
            "1",
            "2",
    })
    public void return_the_same_number_if_no_commas_are_in_the_input(String input) {
        assertEquals(input, stringCalculator.add(input));
    }

    @ParameterizedTest
    @CsvSource({
            "'0,1',1",
            "'1,2',3",
    })
    public void return_sum_of_numbers_in_the_input_when_comma_is_present(String input, String result) {
        assertEquals(result, stringCalculator.add(input));
    }
}
