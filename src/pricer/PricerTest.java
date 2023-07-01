package pricer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricerTest {

    private final Pricer pricer = new Pricer();

    @Test
    public void shouldCalculatePrice(){
     assertEquals("0 €",pricer.calculate(0,0,0));
     assertEquals("1,21 €",pricer.calculate(1,1.21,0));
     assertEquals("3,63 €",pricer.calculate(3,1.21,0));
     assertEquals("3,81 €",pricer.calculate(3,1.21,5));
     assertEquals("4,36 €",pricer.calculate(3,1.21,20));
     assertEquals("1840,58 €",pricer.calculate(5,345.00,10));
     assertEquals("6787,28 €",pricer.calculate(5,1299.00,10));
    }

}