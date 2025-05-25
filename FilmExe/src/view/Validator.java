package view;

/**
 * Class to validate user input in form text fields
 *
 * @author Physanto
 */
public class Validator {

    /**
     * Checks whether the given text is empty(null)
     *
     * @param text the string to evaluate
     * @return true if the text is empty after trimming; false otherwise
     */
    public static boolean isEmpty(String text) {
        return text == null && text.trim().isEmpty();
    }

    /**
     * Checks whether the given text is number
     *
     * @param text the string to evaluate
     * @return true if the text is number; false otherwise
     */
    public static boolean isNumber(String text) {

        for (Character character : text.toCharArray()) {

            if (!Character.isDigit(character)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether the given text is not empty(not null and not whiteSpaces) and whether in the length specified (minimum length and maximum length).
     *
     * @param text is string to evaluate
     * @param lengthMin is int that indicate the length min to string
     * @param lengthMax is int that indicate the length max to string
     * @return true if the text are the length specified.
     */
    public static boolean lengthBetween(String text, int lengthMin, int lengthMax) {
        return !isEmpty(text) && (text.length() >= lengthMin && text.length() <= lengthMax);
    }
}
