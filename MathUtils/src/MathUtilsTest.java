import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(8, mathUtils.add(5, 3));
    }

    @Test
    public void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(2, mathUtils.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(15, mathUtils.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(1.6666666666666667, mathUtils.divide(5, 3), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.0001);
    }
}
