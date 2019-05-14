package Task11_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("([A-Za-z]+[A-za-z0-9_]*)@([A-Za-z0-9_]+)\\.(org|com)");
        Matcher matcher = pattern.matcher("yty888ug_jgg@yhg88f_jh.com");
        System.out.println(matcher.matches());
    }
}
