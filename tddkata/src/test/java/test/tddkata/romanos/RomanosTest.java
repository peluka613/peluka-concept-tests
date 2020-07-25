package test.tddkata.romanos;

import org.junit.Assert;
import org.junit.Test;

public class RomanosTest {

    private NaturalesARomanos aRomanos = new NaturalesARomanos();

    @Test
    public void convertir01ARomanosTest() {
        Assert.assertEquals("I", aRomanos.convertirARomanos(1));
    }


    @Test
    public void convertir02ARomanosTest() {
        Assert.assertEquals("II", aRomanos.convertirARomanos(2));
    }

    @Test
    public void convertir03ARomanosTest() {
        Assert.assertEquals("III", aRomanos.convertirARomanos(3));
    }

    @Test
    public void convertir04ARomanosTest() {
        Assert.assertEquals("IV", aRomanos.convertirARomanos(4));
    }

    @Test
    public void convertir05ARomanosTest() {
        Assert.assertEquals("V", aRomanos.convertirARomanos(5));
    }

    @Test
    public void convertir06ARomanosTest() {
        Assert.assertEquals("VI", aRomanos.convertirARomanos(6));
    }

    @Test
    public void convertir07a09ARomanosTest() {
        Assert.assertEquals("VII", aRomanos.convertirARomanos(7));
        Assert.assertEquals("VIII", aRomanos.convertirARomanos(8));
        Assert.assertEquals("IX", aRomanos.convertirARomanos(9));
    }

    @Test
    public void convertir10a19ARomanosTest() {
        Assert.assertEquals("X", aRomanos.convertirARomanos(10));
        Assert.assertEquals("XI", aRomanos.convertirARomanos(11));
        Assert.assertEquals("XII", aRomanos.convertirARomanos(12));
        Assert.assertEquals("XIII", aRomanos.convertirARomanos(13));
        Assert.assertEquals("XIV", aRomanos.convertirARomanos(14));
        Assert.assertEquals("XV", aRomanos.convertirARomanos(15));
        Assert.assertEquals("XVI", aRomanos.convertirARomanos(16));
        Assert.assertEquals("XVII", aRomanos.convertirARomanos(17));
        Assert.assertEquals("XVIII", aRomanos.convertirARomanos(18));
        Assert.assertEquals("XIX", aRomanos.convertirARomanos(19));
    }

    @Test
    public void convertir20a29ARomanosTest() {
        Assert.assertEquals("XX", aRomanos.convertirARomanos(20));
        Assert.assertEquals("XXI", aRomanos.convertirARomanos(21));
        Assert.assertEquals("XXII", aRomanos.convertirARomanos(22));
        Assert.assertEquals("XXIII", aRomanos.convertirARomanos(23));
        Assert.assertEquals("XXIV", aRomanos.convertirARomanos(24));
        Assert.assertEquals("XXV", aRomanos.convertirARomanos(25));
        Assert.assertEquals("XXVI", aRomanos.convertirARomanos(26));
        Assert.assertEquals("XXVII", aRomanos.convertirARomanos(27));
        Assert.assertEquals("XXVIII", aRomanos.convertirARomanos(28));
        Assert.assertEquals("XXIX", aRomanos.convertirARomanos(29));
    }

    @Test
    public void convertirDecenasARomanosTest() {
        Assert.assertEquals("X", aRomanos.convertirARomanos(10));
        Assert.assertEquals("XX", aRomanos.convertirARomanos(20));
        Assert.assertEquals("XXX", aRomanos.convertirARomanos(30));
        Assert.assertEquals("XL", aRomanos.convertirARomanos(40));
        Assert.assertEquals("L", aRomanos.convertirARomanos(50));
        Assert.assertEquals("LX", aRomanos.convertirARomanos(60));
        Assert.assertEquals("LXX", aRomanos.convertirARomanos(70));
        Assert.assertEquals("LXXX", aRomanos.convertirARomanos(80));
        Assert.assertEquals("XC", aRomanos.convertirARomanos(90));
    }

    @Test
    public void convertirCentenasARomanosTest() {
        Assert.assertEquals("C", aRomanos.convertirARomanos(100));
        Assert.assertEquals("CC", aRomanos.convertirARomanos(200));
        Assert.assertEquals("CCC", aRomanos.convertirARomanos(300));
        Assert.assertEquals("CD", aRomanos.convertirARomanos(400));
        Assert.assertEquals("D", aRomanos.convertirARomanos(500));
        Assert.assertEquals("DC", aRomanos.convertirARomanos(600));
        Assert.assertEquals("DCC", aRomanos.convertirARomanos(700));
        Assert.assertEquals("DCCC", aRomanos.convertirARomanos(800));
        Assert.assertEquals("CM", aRomanos.convertirARomanos(900));
    }

    @Test
    public void convertirMilesARomanosTest() {
        Assert.assertEquals("M", aRomanos.convertirARomanos(1000));
        Assert.assertEquals("MM", aRomanos.convertirARomanos(2000));
        Assert.assertEquals("MMM", aRomanos.convertirARomanos(3000));
        Assert.assertEquals("MMMCMXCIX", aRomanos.convertirARomanos(3999));
    }


}
