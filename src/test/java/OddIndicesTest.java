import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddIndices;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPass() {
        int[] array = {-45, 590, 234, 985, 12, 68};

        Assert.assertEquals(OddIndices.oddIndices(array), new int[]{590, 985, 68});
    }

    @Test
    public void testOddIndicesHappyPassSecond() {
        int[] array = {17, -7, 95, 32, -14, 40};

        Assert.assertEquals(OddIndices.oddIndices(array), new int[]{-7, 32, 40});
    }

    @Test
    public void testOddIndicesEmpty() {
        int[] array = {};

        Assert.assertEquals(OddIndices.oddIndices(array), new int[]{});
    }

    @Test
    public void testOddIndicesElement() {
        int[] array = {10};

        Assert.assertEquals(OddIndices.oddIndices(array), new int[]{});
    }

    @Test
    public void testOddIndicesOneIndex() {
        int[] array = {10, -5, 17};

        Assert.assertEquals(OddIndices.oddIndices(array), new int[]{-5});
    }

}
