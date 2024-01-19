package StringTraining;

import java.util.regex.Pattern;

//Complete the solution so that the function will break up camel casing, using a space between words.

public class SpaceBtwWords {

    public static String breakCamelCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                result.append(" ");
            }

            result.append(currentChar);
        }
        return result.toString();
    }
}