package Task11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPadress {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher("0.0.0.0");
        System.out.println(matcher.matches());

    }
}
