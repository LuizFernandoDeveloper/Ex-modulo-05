package code.model;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        int result  = Calculator.toAdd(2, 2);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testSubtract() {

        int result = Calculator.subtract(0, 1);
        Assert.assertEquals(-1, result);

        result = Calculator.subtract(1, 0);
        Assert.assertEquals(1, result);

        result = Calculator.subtract(5,2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testMultiply() {

        int result = Calculator.multiply(2, 2);
        Assert.assertEquals(4, result);

        result = Calculator.multiply(3, 0);
        Assert.assertEquals(0, result);

        result = Calculator.multiply(0, 3);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testDivide() {

        int result = Calculator.divide(2, 2);
        Assert.assertEquals(1, result);

        result = Calculator.divide(3, 0);
        Assert.assertEquals(0, result);

        result = Calculator.divide(0, 3);
        Assert.assertEquals(0, result);

    }
}
