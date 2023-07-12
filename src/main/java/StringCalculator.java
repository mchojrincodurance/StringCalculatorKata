public class StringCalculator {

    public static final String SEPARATOR = ",";

    public String add(String s) {
        if (s.isEmpty()) {

            return "0";
        }

        if (!s.contains(SEPARATOR)) {

            return s;
        }

        String[] parts = s.split(SEPARATOR);
        int sum = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);

        return Integer.toString(sum);
    }
}
