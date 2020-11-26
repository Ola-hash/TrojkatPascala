import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrojkatPascalaTest {
    private TrojkatPascala trojkatPascala;

    @Before
    public void setUp() throws TrojkatPascalaException {
        trojkatPascala = new TrojkatPascala(5);
    }

    @Test(expected = TrojkatPascalaException.class)
    public void shouldThrownExceptionOnWrongParametersInKonstruktor() throws TrojkatPascalaException {
        new TrojkatPascala(-2);
    }

    @Test(expected = TrojkatPascalaException.class)
    public void shouldThrownExceptionOnWrongParametersInWspolczynnik() throws TrojkatPascalaException {
        trojkatPascala.wspolczynnik(6, 7);
    }

    @Test
    public void sholuldReturnCorecctValue() throws TrojkatPascalaException {
        int value = trojkatPascala.wspolczynnik(1, 1);
        int expectedValue = 1;
        Assert.assertEquals(value, expectedValue);
    }
}
