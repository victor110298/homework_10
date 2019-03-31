package xmlExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilTask {

    private static final String PHONE_REGEX = "^\\+([0-9\\-]?){9,11}[0-9]$";
    private static final String EMAIL_REGEX = "^\\w+[a-zA-Z0-9\\.\\_\\-]*@([a-zA-Z]+\\.)+[a-zA-Z]+$";
    private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(19|2[0-9])([0-9]{2})$";
    private static final String IP_REGEX = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]?|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]?|[0-9])$";

    public boolean validNumber(String number) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validDate(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public boolean validIp(String ip) {
        Pattern pattern = Pattern.compile(IP_REGEX);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
