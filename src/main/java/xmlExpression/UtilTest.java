package xmlExpression;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UtilTest {

    private UtilTask task;

    @Before
    public void initial() {
        task = new UtilTask();
    }

    @Test
    public void validNumber() {
        String number = "+38041225235";
        assertTrue(task.validNumber(number));
    }

    @Test
    public void validEmail() {
        String email = "egor_ka@delaldz.com";
        assertTrue(task.validEmail(email));
    }

    @Test
    public void validDate() {
        String date = "11-02-1998";
        assertFalse(task.validDate(date));
    }

    @Test
    public void validIp() {
        String ip = "192.168.0.1";
        assertTrue(task.validIp(ip));
    }
}
