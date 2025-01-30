import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {  // проверка до граничного значения
        int amount = 700;
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {  // проверка граничного значения
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {  // проверка после граничного значения
        int amount = 1700;
        int expected = 300;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
