package test.tddkata;

import org.junit.Assert;
import org.junit.Test;
import test.tddkata.TesteableClass;

public class TesteableTest {
    private TesteableClass testeableClass = new TesteableClass();

    @Test
    public void test1() {
        Assert.assertEquals("test1", testeableClass.getMessage("test1"));
    }
}
