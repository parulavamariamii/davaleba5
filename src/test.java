import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test{
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(20.00, calculatorService.sum(30.0,50.0), 0.00);
    }

    @Test
    public void prodTest(){
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        assertEquals(100.00, calculatorService.prod(35.0,15.0), 0.00);
    }
}