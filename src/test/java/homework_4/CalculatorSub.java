package homework_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorSub {

    private Calculator calculator;

    @Before
    public void create() {
        calculator = new Calculator();
        System.out.println("Создан экземпляр класса Calculator");

    }

    @Test
    public void subLong(){
        long result = calculator.sub(500L,400L);
        assertEquals(100L, result);
    }

    @Test
    public void subDouble(){
        double result = calculator.sub(300D, 1000D);
        assertEquals(-700D, result, 0.1D);
    }

    @After
    public void doneNull(){
        calculator = null;
        System.out.println("Экземпляр класса Calculator обnullен");


    }

}
