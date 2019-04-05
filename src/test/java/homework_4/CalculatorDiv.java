package homework_4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.testng.Assert.assertEquals;

public class CalculatorDiv {

    Calculator calculator;

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void obnull() {
        calculator = null;
    }

    @Test
    public void calculatorDiv() {
        Double res = 3D;
        assertEquals(calculator.div(30D, 10D), res, 0.1D);
    }


}
