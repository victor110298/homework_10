package xmlExpression;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UtilTest {
    private UtilTask task;

    @Test
    public void validNumber() {
        task = new UtilTask();
        String number = "+38041225235";
        assertTrue(task.validNumber(number));
    }

    @Test
    public void validEmail() {
        task = new UtilTask();
        String email = "egor_ka@delaldz.com";
        assertTrue(task.validEmail(email));
    }

    @Test
    public void validDate() {
        task = new UtilTask();
        String date = "11-02-1998";
        assertFalse(task.validDate(date));
    }

    @Test
    public void validIp() {
        task = new UtilTask();
        String ip = "192.168.0.1";
        assertTrue(task.validIp(ip));
    }
}
