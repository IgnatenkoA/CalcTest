import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMyCalculator
{
    @Test
    /**
     *  проверка сложения
     */


    public void TestMyCalculatorPlusPP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "+", 5);
        assertEquals(12, n, 1e-10);


    }

    public void TestMyCalculatorPlusMP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

    double n = TestMyCalculator.MyCalculator(-7, "+", 5);
    assertEquals(-2, n, 1e-10);


}

    public void TestMyCalculatorPlusPM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "+", -5);
        assertEquals(2, n, 1e-10);


    }

    public void TestMyCalculatorPlusMM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-7, "+", -5);
        assertEquals(-12, n, 1e-10);


    }
    public void TestMyCalculatorPlusPN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "+", 0);
        assertEquals(7, n, 1e-10);


    }
    public void TestMyCalculatorPlusNM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "+", -5);
        assertEquals(-5, n, 1e-10);


    }
    public void TestMyCalculatorPlusNN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "+", 0);
        assertEquals(0, n, 1e-10);


    }

/**
 *  проверка вычитания
 */


public void TestMyCalculatorMinusPP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

    double n = TestMyCalculator.MyCalculator(7, "-", 5);
    assertEquals(2, n, 1e-10);


}

    public void TestMyCalculatorMinusMP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-7, "-", 5);
        assertEquals(-12, n, 1e-10);


    }

    public void TestMyCalculatorMinusPM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "-", -5);
        assertEquals(12, n, 1e-10);


    }

    public void TestMyCalculatorMinusMM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-7, "-", -5);
        assertEquals(-2, n, 1e-10);


    }
    public void TestMyCalculatorMinusPN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "-", 0);
        assertEquals(7, n, 1e-10);


    }
    public void TestMyCalculatorMinusNM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "-", -5);
        assertEquals(5, n, 1e-10);


    }
    public void TestMyCalculatorMinusNN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "-", 0);
        assertEquals(0, n, 1e-10);


    }

    /**
     *  проверка умножения
     */


    public void TestMyCalculatorUmnPP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "*", 5);
        assertEquals(35, n, 1e-10);


    }

    public void TestMyCalculatorUmnMP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-7, "*", 5);
        assertEquals(-35, n, 1e-10);


    }

    public void TestMyCalculatorUmnPM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "*", -5);
        assertEquals(-35, n, 1e-10);


    }

    public void TestMyCalculatorUmnMM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-7, "*", -5);
        assertEquals(35, n, 1e-10);


    }
    public void TestMyCalculatorUmnPN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(7, "*", 0);
        assertEquals(0, n, 1e-10);


    }
    public void TestMyCalculatorUmnNM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "*", -5);
        assertEquals(0, n, 1e-10);


    }
    public void TestMyCalculatorUmnNN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "*", 0);
        assertEquals(0, n, 1e-10);


    }

    /**
     *  проверка деления
     */


    public void TestMyCalculatorDelPP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(20, "/", 5);
        assertEquals(4, n, 1e-10);


    }

    public void TestMyCalculatorDelMP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-20, "/", 5);
        assertEquals(-4, n, 1e-10);


    }

    public void TestMyCalculatorDelPM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(20, "/", -5);
        assertEquals(-4, n, 1e-10);


    }

    public void TestMyCalculatorDelMM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(-20, "/", -5);
        assertEquals(4, n, 1e-10);


    }
    public void TestMyCalculatorDelNP() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "/", 7);
        assertEquals(0, n, 1e-10);


    }
    public void TestMyCalculatorDelNM() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "/", -5);
        assertEquals(0, n, 1e-10);


    }
    public void TestMyCalculatorUmnNN() throws Exception { MyCalculator TestMyCalculator = new MyCalculator();

        double n = TestMyCalculator.MyCalculator(0, "*", 0);
        assertEquals(0, n, 1e-10);


    }
