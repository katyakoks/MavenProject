import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPathOdd() {
        int num = 345;

        Assert.assertEquals(OddEven.oddEven(num),"Odd");
    }

    @Test
    public void testOddEvenHappyPathEven() {
        int num = 0;

        Assert.assertEquals(OddEven.oddEven(num), "Even");
    }

    @Test
    public void testOddEvenHappyPathEvenSecond() {
        int num = 222222;

        Assert.assertEquals(OddEven.oddEven(num), "Even");
    }

    @Test
    public void testOddEvenHappyPathUndefined() {
        long num = 2147483647L + 1;

        Assert.assertEquals(OddEven.oddEven(num), "unknown");
    }

    @Test
    public void testOddEvenMaxInteger() {
        int num = 2147483647;

        Assert.assertEquals( OddEven.oddEven(num),"Odd");
    }

    @Test
    public void testOddEvenMinInteger() {
        int num = -2147483648;

        Assert.assertEquals(OddEven.oddEven(num),"Even");
    }

    @Test
    public void testOddEvenMaxIntegerMinusOne() {
        int num = 2147483647 - 1;

        Assert.assertEquals(OddEven.oddEven(num), "Even");
    }

    @Test
    public void testOddEvenMinIntegerPlusOne() {
        int num = -2147483648 + 1;

        Assert.assertEquals(OddEven.oddEven(num), "Odd");
    }
}
