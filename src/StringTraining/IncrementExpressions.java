package StringTraining;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncrementExpressions {
    public static String incrementString(String str) {
        Matcher matcher = Pattern.compile("\\d+$").matcher(str);
        if (matcher.find()) {
            int lenOfNumber = matcher.group().length();
            BigInteger number = new BigInteger(matcher.group());
            number = number.add(BigInteger.ONE);
            int countNumerals = number.toString().length();
            str = deleteLastNumber(str);
            if (lenOfNumber > countNumerals) {
                for (int i = 0; i < lenOfNumber - countNumerals; i++) {
                    str += 0;
                }
                return str + number.toString();
            }
            str = deleteLastNumber(str);
            return str + number;
        } else {
            return str + "1";
        }
    }


    private static String deleteLastNumber(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.reverse().toString();
        str = str.replaceFirst("^\\d+", "");
        stringBuilder = new StringBuilder(str);
        str = String.valueOf(stringBuilder.reverse());
        return str;
    }
}
