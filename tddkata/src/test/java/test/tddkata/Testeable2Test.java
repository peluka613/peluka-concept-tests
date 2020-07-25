package test.tddkata;

import org.junit.Assert;
import org.junit.Test;

public class Testeable2Test {
    private Testeable2Class testeable2Class = new Testeable2Class();

    @Test
    public void sumaEnteros() {
        Assert.assertEquals(10, testeable2Class.sum(4, 6));
        Assert.assertEquals(13, testeable2Class.sum(10, 3));
    }
}
