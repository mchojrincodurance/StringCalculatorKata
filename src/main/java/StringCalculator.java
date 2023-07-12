import java.util.Arrays;

public class StringCalculator {
    public String add(String s) {
        if (s.isEmpty()) {

            return "0";
        }

        if (!s.contains(",")) {

            return s;
        }

        String[] parts = s.split(",");
        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        return Integer.toString(sum);
    }
}
