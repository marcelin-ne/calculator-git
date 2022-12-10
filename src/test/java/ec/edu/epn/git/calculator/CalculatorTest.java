package ec.edu.epn.git.calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

    Calculator c;

    @BeforeClass
    public static void SetUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("SetUp()");
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(3, 3));
    }

    @Test
    public void given_two_integers_when_subtracction_then_ok() {
        System.out.println("Test 2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 3");
        assertEquals(1, c.divide(1, 0), 0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception() {
        System.out.println("Test 4");
        c.timeout(100);
    }

    @Test
    public void given_two_other_integers_when_multiplicacion_then_ok() {
        System.out.println("Test 5");
        assertEquals(12, c.multiplicate(6, 2), 0.0);

    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }

}