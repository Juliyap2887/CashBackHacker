import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import java.security.Provider;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {  // проверка до граничного значения
        int amount = 600;
        int expected = 400;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {  // проверка граничного значения
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3() {  // проверка после граничного значения
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }


}
