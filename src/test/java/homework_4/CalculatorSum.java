package homework_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorSum {

    private Calculator calculator;

    @Before
        public void create() {
        calculator = new Calculator();
        System.out.println("Создан экземпляр класса Calculator");

    }

    @Test
    public void sumLong(){
        long result = calculator.sum(2019L, 1L);
        assertEquals(2020L, result);
    }

    @Test
    public void sumDouble() {
        double result = calculator.sum(160D, 40D);
        assertEquals(200D, result, 0.1D);
    }

    @After
        public void doneNull(){
        calculator = null;
        System.out.println("Экземпляр класса Calculator обnullен");


    }

}
