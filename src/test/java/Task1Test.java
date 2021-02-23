import hw6.Hw6;
import org.junit.*;

public class Task1Test {
    @Test
    public void testArr1() {
        Assert.assertArrayEquals(new int[]{1, 7}, Hw6.task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test(expected = RuntimeException.class)
    public void testArr2() {
        Assert.assertArrayEquals(new int[]{1, 7}, Hw6.task1(new int[]{1, 2, 2, 3, 1, 1, 7}));
    }

}
