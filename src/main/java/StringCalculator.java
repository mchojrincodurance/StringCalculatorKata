import java.util.Arrays;

public class StringCalculator {
    public String add(String s) {
        if (s.isEmpty()) {

            return "0";
        }

        if (!s.contains(",")) {

            return s;
        }

        return "1";
    }
}
