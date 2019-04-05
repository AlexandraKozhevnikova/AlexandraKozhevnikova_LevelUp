package homework_4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;


import static org.testng.Assert.assertEquals;


public class CalculatorMult {

    private Calculator calculator;

    @BeforeMethod
    public void init(){
        calculator = new Calculator();
    }

    @AfterMethod
    public void destroy() {
        System.out.println("Calc destroy");
        calculator = null;
    }

    @DataProvider
    public Object[][] dataForMult() {
        return new Object[][] {
                {1L, 0L, 0L},
                {-3L, 2L, -6L},
                {4L, -8L, -32L},
                {-6L, -5L, 30L},
                {25L, 1L, 25L},
        };
    }

    @Test(dataProvider = "dataForMult")
    public void calculatorMult(double a, double b, double res) {
        assertEquals(res, calculator.mult(a, b));
    }


}
