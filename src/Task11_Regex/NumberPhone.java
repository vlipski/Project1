package Task11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    public static void main(String[] args) {
        String str = new String();
        str = "+375295776289 ghfgjk 375289876574 jhhhhhhbfhg375295776289 +375295552236 jhljk+375778765434";
        Pattern pattern = Pattern.compile("\\+375(\\d\\d)(\\d{3})(\\d{2})(\\d{2})(\\s|$)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String number = matcher.group().replaceAll("\\+375(\\d\\d)(\\d{3})(\\d{2})(\\d{2})(\\s|$)",
                    "+375(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4) + " ");
            // System.out.println(number);
            str = str.replaceFirst("\\+375(\\d\\d)(\\d{3})(\\d{2})(\\d{2})(\\s|$)", number);
            // System.out.println( str);
        }
        System.out.println(str);

    }
}
