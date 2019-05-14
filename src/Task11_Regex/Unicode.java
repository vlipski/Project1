package Task11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unicode {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("0[xX][A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher("yt0x76a5yug_jgg@yhgf0Xd45a_jh.com");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
