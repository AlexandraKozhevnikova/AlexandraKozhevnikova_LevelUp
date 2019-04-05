package homework_4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorSum.class, CalculatorSub.class})


public class SuiteSumSub {

    @BeforeClass
    public static void setUp() {
        System.out.println("Cьют сложения и вычитания запущен");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Сьют сложения и вычитания закончен");
    }


}
