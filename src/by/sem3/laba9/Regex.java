package by.sem3.laba9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void deleteSymbolsInBrackets(StringBuffer str) {
        Pattern pattern = Pattern.compile("[(][^)]*[)]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find(0)) {
            str.delete(matcher.start(), matcher.end());
        }
    }

    public static void deleteDigits(StringBuffer str) {
        Pattern pattern = Pattern.compile("[0-9]{3,}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find(0)) {
            str.delete(matcher.start() + 2, matcher.end());
        }
    }

    public static void deleteZeros(StringBuffer str) {
        Pattern pattern = Pattern.compile("(^|[^0-9])[0]+[0-9]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find(0)) {
            if (matcher.start() == 0) {
                str.delete(matcher.start(), matcher.end() - 1);
            } else {
                str.delete(matcher.start() + 1, matcher.end() - 1);
            }
        }
    }
}
