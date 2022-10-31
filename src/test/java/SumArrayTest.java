import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.SumArray;

public class SumArrayTest {

    @Test
    public void testSumArrayHappyPass() {
        int[] array = {0, 1, 2, 3, 4, 5};

        Assert.assertEquals(SumArray.sumArray(array), 15);
    }

    @Test
    public void testSumArrayHappyPassSecond() {
        int[] array = {-7, -3};

        Assert.assertEquals(SumArray.sumArray(array), -10);
    }

    @Test
    public void testSumArrayEmpty() {
        int[] array = {};

        Assert.assertEquals(SumArray.sumArray(array), 0);
    }

    @Test
    public void testSumArrayOneElement() {
        int[] array = {10};

        Assert.assertEquals(SumArray.sumArray(array), 10);
    }

    @Test
    public void testSumArrayZero() {
        int[] array = {0};

        Assert.assertEquals(SumArray.sumArray(array), 0);
    }

    @Test
    public void testSumArrayNegativeAndPositiveNumbersInArray() {
        int[] array = {-1, 1, -2, 2, 10, -10};

        Assert.assertEquals(SumArray.sumArray(array), 0);
    }
}
