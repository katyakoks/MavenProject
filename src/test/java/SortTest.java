import org.testng.Assert;
import org.testng.annotations.Test;

public class SortTest {

    @Test
    public void testSort_HappyPath() {

        int [] array = {56, 1, 34, 35};
        int [] expectedResult = {1, 34, 35, 56};
        Assert.assertEquals(Sort.bubbleSort(array), expectedResult);
    }

}
