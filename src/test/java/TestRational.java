import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRational {
    @Test(expected = IllegalArgumentException.class)
    public void test(){
        Rational r = new Rational(1,0);
    }

    @Test
    public void testtoString(){
        Rational r = new Rational(1,5);
        assertEquals("La salida deber ser: 1/5","1/5", r.toString());
    }

    @Test
    public void testisLessThan(){
        Rational r = new Rational(1,7);
        Rational x = new Rational(1,4);
        assertEquals("El número menor debe ser: 1/7",true, r.isLessThan(x));
    }
    @Test
    public void testgetGreater(){
        Rational r = new Rational(1,3);
        Rational x = new Rational(1,2);
        assertEquals("El número mayor debe ser: 1/2",x,x.getGreater(r));
    }
    @Test
    public void testplus(){
        Rational r = new Rational(1,5);
        Rational x = new Rational(4,2);
        assertEquals("El suma debe ser: 11/5","11/5",x.plus(r).toString());
    }
    @Test
    public void testminus(){
        Rational r = new Rational(2,4);
        Rational x = new Rational(1,3);
        assertEquals("La resta debe ser: 1/6",1,r.minus(x).getNumerator());
        assertEquals("La resta debe ser: 1/6",6,r.minus(x).getDenominator());
    }
    @Test
    public void testtimes(){
        Rational r = new Rational(1,2);
        Rational x = new Rational(3,4);
        assertEquals("El multiplciación debe ser: 3/8","3/8",x.times(r).toString());
    }
    @Test
    public void testdivides(){
        Rational r = new Rational(1,5);
        Rational x = new Rational(4,2);
        assertEquals("El división debe ser: 10","10",x.divides(r).toString());
    }
}
